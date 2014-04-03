
package com.cgi.soa.masterclass.clickpay.samplebank.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cgi.soa.masterclass.clickpay.samplebank.ws package. 
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

    private final static QName _IsAccountOwnerResponse_QNAME = new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "isAccountOwnerResponse");
    private final static QName _IsAccountOwner_QNAME = new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "isAccountOwner");
    private final static QName _IsBalanceCovered_QNAME = new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "isBalanceCovered");
    private final static QName _Transfer_QNAME = new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "transfer");
    private final static QName _TransferResponse_QNAME = new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "transferResponse");
    private final static QName _IsAccountExist_QNAME = new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "isAccountExist");
    private final static QName _IsAccountExistResponse_QNAME = new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "isAccountExistResponse");
    private final static QName _IsBalanceCoveredResponse_QNAME = new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "isBalanceCoveredResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cgi.soa.masterclass.clickpay.samplebank.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsAccountOwnerResponse }
     * 
     */
    public IsAccountOwnerResponse createIsAccountOwnerResponse() {
        return new IsAccountOwnerResponse();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link IsBalanceCovered }
     * 
     */
    public IsBalanceCovered createIsBalanceCovered() {
        return new IsBalanceCovered();
    }

    /**
     * Create an instance of {@link IsAccountOwner }
     * 
     */
    public IsAccountOwner createIsAccountOwner() {
        return new IsAccountOwner();
    }

    /**
     * Create an instance of {@link IsAccountExist }
     * 
     */
    public IsAccountExist createIsAccountExist() {
        return new IsAccountExist();
    }

    /**
     * Create an instance of {@link IsAccountExistResponse }
     * 
     */
    public IsAccountExistResponse createIsAccountExistResponse() {
        return new IsAccountExistResponse();
    }

    /**
     * Create an instance of {@link IsBalanceCoveredResponse }
     * 
     */
    public IsBalanceCoveredResponse createIsBalanceCoveredResponse() {
        return new IsBalanceCoveredResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAccountOwnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.samplebank.masterclass.soa.cgi.com/", name = "isAccountOwnerResponse")
    public JAXBElement<IsAccountOwnerResponse> createIsAccountOwnerResponse(IsAccountOwnerResponse value) {
        return new JAXBElement<IsAccountOwnerResponse>(_IsAccountOwnerResponse_QNAME, IsAccountOwnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAccountOwner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.samplebank.masterclass.soa.cgi.com/", name = "isAccountOwner")
    public JAXBElement<IsAccountOwner> createIsAccountOwner(IsAccountOwner value) {
        return new JAXBElement<IsAccountOwner>(_IsAccountOwner_QNAME, IsAccountOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsBalanceCovered }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.samplebank.masterclass.soa.cgi.com/", name = "isBalanceCovered")
    public JAXBElement<IsBalanceCovered> createIsBalanceCovered(IsBalanceCovered value) {
        return new JAXBElement<IsBalanceCovered>(_IsBalanceCovered_QNAME, IsBalanceCovered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.samplebank.masterclass.soa.cgi.com/", name = "transfer")
    public JAXBElement<Transfer> createTransfer(Transfer value) {
        return new JAXBElement<Transfer>(_Transfer_QNAME, Transfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.samplebank.masterclass.soa.cgi.com/", name = "transferResponse")
    public JAXBElement<TransferResponse> createTransferResponse(TransferResponse value) {
        return new JAXBElement<TransferResponse>(_TransferResponse_QNAME, TransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAccountExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.samplebank.masterclass.soa.cgi.com/", name = "isAccountExist")
    public JAXBElement<IsAccountExist> createIsAccountExist(IsAccountExist value) {
        return new JAXBElement<IsAccountExist>(_IsAccountExist_QNAME, IsAccountExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsAccountExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.samplebank.masterclass.soa.cgi.com/", name = "isAccountExistResponse")
    public JAXBElement<IsAccountExistResponse> createIsAccountExistResponse(IsAccountExistResponse value) {
        return new JAXBElement<IsAccountExistResponse>(_IsAccountExistResponse_QNAME, IsAccountExistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsBalanceCoveredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.samplebank.masterclass.soa.cgi.com/", name = "isBalanceCoveredResponse")
    public JAXBElement<IsBalanceCoveredResponse> createIsBalanceCoveredResponse(IsBalanceCoveredResponse value) {
        return new JAXBElement<IsBalanceCoveredResponse>(_IsBalanceCoveredResponse_QNAME, IsBalanceCoveredResponse.class, null, value);
    }

}
