import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Demo2 {

	public static List<String> getBookNames(final String path) {
		final List<String> list = new ArrayList<String>();
		final DocumentBuilderFactory factory = DocumentBuilderFactory
			.newInstance();
		try {
			final DocumentBuilder builder = factory.newDocumentBuilder();
			final Document document = builder.parse(new File(path));
			final Element root = document.getDocumentElement();
			final NodeList bookNodes = root.getElementsByTagName("book");
			for (int i = 0; i < bookNodes.getLength(); i++) {
				final Element bookElement = (Element) bookNodes.item(i);
				final NodeList childNodes = bookElement.getChildNodes();
				for (int j = 0; j < childNodes.getLength(); j++) {
					if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
						if ("title".equals(childNodes.item(j).getNodeName())) {
							list.add(childNodes.item(j).getFirstChild()
									 .getNodeValue());
						}
					}
				}
			}
		} catch (final FileNotFoundException e) {
			// TODO
		} catch (final ParserConfigurationException e) {
			// TODO
		} catch (final IOException e) {
			// TODO
		} catch (final SAXException e) {
			// TODO
		}
		return list;
	}
}
