package dsaa.lab03;

import java.util.Scanner;

public class Document{
	public String name;
	public TwoWayUnorderedListWithHeadAndTail<Link> links;
	public Document(String name, Scanner scan) {
		this.name=name;
		this.links =new TwoWayUnorderedListWithHeadAndTail<Link>();
		load(scan);
	}
	public void load(Scanner scan) {

		while (scan.hasNextLine()) {
			String line = scan.nextLine().toLowerCase();
			if (line.equals("eod"))
				break;

			String[] word = line.split("\\s+");
			for (String s : word) {
				if (correctLink(s)) {
					this.links.add(new Link(s.substring(5)));
				}
			}
		}
	}

	//  there is no need to check the capital letters, because the links have to be outputted in the lowercase+numbers+_ format anyway,
	//  so the line can be lowercased immediately after scanning. Also, it simplifies link checking as ex. LiNk -> link, that is easier to implement using regex

	private static boolean correctLink(String link) {
		return link.matches("link=[a-z]+[a-z0-9_]*$");
	}


	@Override
	public String toString() {
		String refStr = "Document: " + name;
		return refStr + links.toString();
	}

	public String toStringReverse() {
		String retStr = "Document: " + name;
		return retStr + links.toStringReverse();
	}

}
