
package org.gnucash.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.gnucash.xml.gnc.GnuCashXml;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GncV2_QNAME = new QName("", "gnc-v2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GnuCashXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gnc-v2")
    public JAXBElement<GnuCashXml> createGncV2(GnuCashXml value) {
        return new JAXBElement<GnuCashXml>(_GncV2_QNAME, GnuCashXml.class, null, value);
    }

}
