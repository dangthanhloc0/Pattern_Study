package adapter_Pattern.iImpl;

import adapter_Pattern.XmlReader;
import adapter_Pattern.interfaceEx.JsonReader;

public class XmlToJsonAdapter implements JsonReader {
    private XmlReader xmlReader;

    public XmlToJsonAdapter(XmlReader xmlReader) {
        this.xmlReader = xmlReader;
    }

    @Override
    public String readJson() {
        String xml = xmlReader.readXml();
        // Simulate XML → JSON conversion
        return "{ \"data\": \"Example JSON converted from XML\" }";
    }
}

