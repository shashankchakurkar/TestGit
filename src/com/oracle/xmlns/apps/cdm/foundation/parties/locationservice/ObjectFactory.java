
package com.oracle.xmlns.apps.cdm.foundation.parties.locationservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.locationservice package. 
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

    private final static QName _LocationResult_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "locationResult");
    private final static QName _LocationLocaleResult_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "locationLocaleResult");
    private final static QName _LocationLocale_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "locationLocale");
    private final static QName _LocationProfile_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "locationProfile");
    private final static QName _Location_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "location");
    private final static QName _LocationProfileEffectiveEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "EffectiveEndDate");
    private final static QName _LocationProfileDateValidated_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "DateValidated");
    private final static QName _LocationProfileRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "RequestId");
    private final static QName _LocationProfileValidationStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "ValidationStatusCode");
    private final static QName _LocationProfileFloorNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "FloorNumber");
    private final static QName _LocationProfileBuilding_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Building");
    private final static QName _LocationProfileProvince_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Province");
    private final static QName _LocationProfileAddrElementAttribute3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "AddrElementAttribute3");
    private final static QName _LocationProfileAddrElementAttribute4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "AddrElementAttribute4");
    private final static QName _LocationProfileAddrElementAttribute1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "AddrElementAttribute1");
    private final static QName _LocationProfileCounty_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "County");
    private final static QName _LocationProfileAddrElementAttribute2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "AddrElementAttribute2");
    private final static QName _LocationProfileCity_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "City");
    private final static QName _LocationProfileAddress2_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Address2");
    private final static QName _LocationProfileAddrElementAttribute5_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "AddrElementAttribute5");
    private final static QName _LocationProfileAddress3_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Address3");
    private final static QName _LocationProfilePostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "PostalCode");
    private final static QName _LocationProfileAddress4_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Address4");
    private final static QName _LocationProfileState_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "State");
    private final static QName _LocationProfileLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "LastUpdateLogin");
    private final static QName _LocationLocaleAddress1_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Address1");
    private final static QName _LocationLocalePostalPlus4Code_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "PostalPlus4Code");
    private final static QName _LocationSalesTaxGeocode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "SalesTaxGeocode");
    private final static QName _LocationTimezoneCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "TimezoneCode");
    private final static QName _LocationDescription_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Description");
    private final static QName _LocationSalesTaxInsideCityLimits_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "SalesTaxInsideCityLimits");
    private final static QName _LocationShortDescription_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "ShortDescription");
    private final static QName _LocationLatitude_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Latitude");
    private final static QName _LocationLanguage_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Language");
    private final static QName _LocationHouseType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "HouseType");
    private final static QName _LocationDoNotValidateFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "DoNotValidateFlag");
    private final static QName _LocationOrigSystem_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "OrigSystem");
    private final static QName _LocationClliCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "ClliCode");
    private final static QName _LocationAddressStyle_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "AddressStyle");
    private final static QName _LocationDistance_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Distance");
    private final static QName _LocationCreatedByModule_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "CreatedByModule");
    private final static QName _LocationFaLocationId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "FaLocationId");
    private final static QName _LocationAddressLinesPhonetic_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "AddressLinesPhonetic");
    private final static QName _LocationComments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Comments");
    private final static QName _LocationPosition_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Position");
    private final static QName _LocationLongitude_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "Longitude");
    private final static QName _LocationAddressExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "AddressExpirationDate");
    private final static QName _LocationLocationDirections_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "LocationDirections");
    private final static QName _LocationValidatedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "ValidatedFlag");
    private final static QName _LocationAddressEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "AddressEffectiveDate");
    private final static QName _LocationEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "EffectiveDate");
    private final static QName _LocationGeometryStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", "GeometryStatusCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.locationservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link LocationResult }
     * 
     */
    public LocationResult createLocationResult() {
        return new LocationResult();
    }

    /**
     * Create an instance of {@link LocationLocale }
     * 
     */
    public LocationLocale createLocationLocale() {
        return new LocationLocale();
    }

    /**
     * Create an instance of {@link LocationLocaleResult }
     * 
     */
    public LocationLocaleResult createLocationLocaleResult() {
        return new LocationLocaleResult();
    }

    /**
     * Create an instance of {@link LocationProfile }
     * 
     */
    public LocationProfile createLocationProfile() {
        return new LocationProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "locationResult")
    public JAXBElement<LocationResult> createLocationResult(LocationResult value) {
        return new JAXBElement<LocationResult>(_LocationResult_QNAME, LocationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationLocaleResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "locationLocaleResult")
    public JAXBElement<LocationLocaleResult> createLocationLocaleResult(LocationLocaleResult value) {
        return new JAXBElement<LocationLocaleResult>(_LocationLocaleResult_QNAME, LocationLocaleResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationLocale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "locationLocale")
    public JAXBElement<LocationLocale> createLocationLocale(LocationLocale value) {
        return new JAXBElement<LocationLocale>(_LocationLocale_QNAME, LocationLocale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "locationProfile")
    public JAXBElement<LocationProfile> createLocationProfile(LocationProfile value) {
        return new JAXBElement<LocationProfile>(_LocationProfile_QNAME, LocationProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "location")
    public JAXBElement<Location> createLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "EffectiveEndDate", scope = LocationProfile.class)
    public JAXBElement<XMLGregorianCalendar> createLocationProfileEffectiveEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LocationProfileEffectiveEndDate_QNAME, XMLGregorianCalendar.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "DateValidated", scope = LocationProfile.class)
    public JAXBElement<XMLGregorianCalendar> createLocationProfileDateValidated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LocationProfileDateValidated_QNAME, XMLGregorianCalendar.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "RequestId", scope = LocationProfile.class)
    public JAXBElement<Long> createLocationProfileRequestId(Long value) {
        return new JAXBElement<Long>(_LocationProfileRequestId_QNAME, Long.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "ValidationStatusCode", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileValidationStatusCode(String value) {
        return new JAXBElement<String>(_LocationProfileValidationStatusCode_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "FloorNumber", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileFloorNumber(String value) {
        return new JAXBElement<String>(_LocationProfileFloorNumber_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Building", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileBuilding(String value) {
        return new JAXBElement<String>(_LocationProfileBuilding_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Province", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileProvince(String value) {
        return new JAXBElement<String>(_LocationProfileProvince_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute3", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileAddrElementAttribute3(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute3_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute4", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileAddrElementAttribute4(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute4_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute1", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileAddrElementAttribute1(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute1_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "County", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileCounty(String value) {
        return new JAXBElement<String>(_LocationProfileCounty_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute2", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileAddrElementAttribute2(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute2_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "City", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileCity(String value) {
        return new JAXBElement<String>(_LocationProfileCity_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address2", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileAddress2(String value) {
        return new JAXBElement<String>(_LocationProfileAddress2_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute5", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileAddrElementAttribute5(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute5_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address3", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileAddress3(String value) {
        return new JAXBElement<String>(_LocationProfileAddress3_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "PostalCode", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfilePostalCode(String value) {
        return new JAXBElement<String>(_LocationProfilePostalCode_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address4", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileAddress4(String value) {
        return new JAXBElement<String>(_LocationProfileAddress4_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "State", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileState(String value) {
        return new JAXBElement<String>(_LocationProfileState_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "LastUpdateLogin", scope = LocationProfile.class)
    public JAXBElement<String> createLocationProfileLastUpdateLogin(String value) {
        return new JAXBElement<String>(_LocationProfileLastUpdateLogin_QNAME, String.class, LocationProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "FloorNumber", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleFloorNumber(String value) {
        return new JAXBElement<String>(_LocationProfileFloorNumber_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Building", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleBuilding(String value) {
        return new JAXBElement<String>(_LocationProfileBuilding_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute3", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleAddrElementAttribute3(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute3_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Province", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleProvince(String value) {
        return new JAXBElement<String>(_LocationProfileProvince_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute4", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleAddrElementAttribute4(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute4_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute1", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleAddrElementAttribute1(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute1_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute2", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleAddrElementAttribute2(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute2_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "County", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleCounty(String value) {
        return new JAXBElement<String>(_LocationProfileCounty_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address1", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleAddress1(String value) {
        return new JAXBElement<String>(_LocationLocaleAddress1_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "City", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleCity(String value) {
        return new JAXBElement<String>(_LocationProfileCity_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute5", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleAddrElementAttribute5(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute5_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address2", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleAddress2(String value) {
        return new JAXBElement<String>(_LocationProfileAddress2_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address3", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleAddress3(String value) {
        return new JAXBElement<String>(_LocationProfileAddress3_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "PostalCode", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocalePostalCode(String value) {
        return new JAXBElement<String>(_LocationProfilePostalCode_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address4", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleAddress4(String value) {
        return new JAXBElement<String>(_LocationProfileAddress4_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "State", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleState(String value) {
        return new JAXBElement<String>(_LocationProfileState_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "PostalPlus4Code", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocalePostalPlus4Code(String value) {
        return new JAXBElement<String>(_LocationLocalePostalPlus4Code_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "LastUpdateLogin", scope = LocationLocale.class)
    public JAXBElement<String> createLocationLocaleLastUpdateLogin(String value) {
        return new JAXBElement<String>(_LocationProfileLastUpdateLogin_QNAME, String.class, LocationLocale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "SalesTaxGeocode", scope = Location.class)
    public JAXBElement<String> createLocationSalesTaxGeocode(String value) {
        return new JAXBElement<String>(_LocationSalesTaxGeocode_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "FloorNumber", scope = Location.class)
    public JAXBElement<String> createLocationFloorNumber(String value) {
        return new JAXBElement<String>(_LocationProfileFloorNumber_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "TimezoneCode", scope = Location.class)
    public JAXBElement<String> createLocationTimezoneCode(String value) {
        return new JAXBElement<String>(_LocationTimezoneCode_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Description", scope = Location.class)
    public JAXBElement<String> createLocationDescription(String value) {
        return new JAXBElement<String>(_LocationDescription_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Building", scope = Location.class)
    public JAXBElement<String> createLocationBuilding(String value) {
        return new JAXBElement<String>(_LocationProfileBuilding_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "SalesTaxInsideCityLimits", scope = Location.class)
    public JAXBElement<String> createLocationSalesTaxInsideCityLimits(String value) {
        return new JAXBElement<String>(_LocationSalesTaxInsideCityLimits_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "ShortDescription", scope = Location.class)
    public JAXBElement<String> createLocationShortDescription(String value) {
        return new JAXBElement<String>(_LocationShortDescription_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "County", scope = Location.class)
    public JAXBElement<String> createLocationCounty(String value) {
        return new JAXBElement<String>(_LocationProfileCounty_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Latitude", scope = Location.class)
    public JAXBElement<BigDecimal> createLocationLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LocationLatitude_QNAME, BigDecimal.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "PostalCode", scope = Location.class)
    public JAXBElement<String> createLocationPostalCode(String value) {
        return new JAXBElement<String>(_LocationProfilePostalCode_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address4", scope = Location.class)
    public JAXBElement<String> createLocationAddress4(String value) {
        return new JAXBElement<String>(_LocationProfileAddress4_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Language", scope = Location.class)
    public JAXBElement<String> createLocationLanguage(String value) {
        return new JAXBElement<String>(_LocationLanguage_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "HouseType", scope = Location.class)
    public JAXBElement<String> createLocationHouseType(String value) {
        return new JAXBElement<String>(_LocationHouseType_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "DoNotValidateFlag", scope = Location.class)
    public JAXBElement<Boolean> createLocationDoNotValidateFlag(Boolean value) {
        return new JAXBElement<Boolean>(_LocationDoNotValidateFlag_QNAME, Boolean.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "OrigSystem", scope = Location.class)
    public JAXBElement<String> createLocationOrigSystem(String value) {
        return new JAXBElement<String>(_LocationOrigSystem_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "ClliCode", scope = Location.class)
    public JAXBElement<String> createLocationClliCode(String value) {
        return new JAXBElement<String>(_LocationClliCode_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddressStyle", scope = Location.class)
    public JAXBElement<String> createLocationAddressStyle(String value) {
        return new JAXBElement<String>(_LocationAddressStyle_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Distance", scope = Location.class)
    public JAXBElement<BigDecimal> createLocationDistance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LocationDistance_QNAME, BigDecimal.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "CreatedByModule", scope = Location.class)
    public JAXBElement<String> createLocationCreatedByModule(String value) {
        return new JAXBElement<String>(_LocationCreatedByModule_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "FaLocationId", scope = Location.class)
    public JAXBElement<Long> createLocationFaLocationId(Long value) {
        return new JAXBElement<Long>(_LocationFaLocationId_QNAME, Long.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddressLinesPhonetic", scope = Location.class)
    public JAXBElement<String> createLocationAddressLinesPhonetic(String value) {
        return new JAXBElement<String>(_LocationAddressLinesPhonetic_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Comments", scope = Location.class)
    public JAXBElement<String> createLocationComments(String value) {
        return new JAXBElement<String>(_LocationComments_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "RequestId", scope = Location.class)
    public JAXBElement<Long> createLocationRequestId(Long value) {
        return new JAXBElement<Long>(_LocationProfileRequestId_QNAME, Long.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "DateValidated", scope = Location.class)
    public JAXBElement<XMLGregorianCalendar> createLocationDateValidated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LocationProfileDateValidated_QNAME, XMLGregorianCalendar.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Position", scope = Location.class)
    public JAXBElement<String> createLocationPosition(String value) {
        return new JAXBElement<String>(_LocationPosition_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "ValidationStatusCode", scope = Location.class)
    public JAXBElement<String> createLocationValidationStatusCode(String value) {
        return new JAXBElement<String>(_LocationProfileValidationStatusCode_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Province", scope = Location.class)
    public JAXBElement<String> createLocationProvince(String value) {
        return new JAXBElement<String>(_LocationProfileProvince_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute3", scope = Location.class)
    public JAXBElement<String> createLocationAddrElementAttribute3(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute3_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute4", scope = Location.class)
    public JAXBElement<String> createLocationAddrElementAttribute4(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute4_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute1", scope = Location.class)
    public JAXBElement<String> createLocationAddrElementAttribute1(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute1_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute2", scope = Location.class)
    public JAXBElement<String> createLocationAddrElementAttribute2(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute2_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Longitude", scope = Location.class)
    public JAXBElement<BigDecimal> createLocationLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LocationLongitude_QNAME, BigDecimal.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "City", scope = Location.class)
    public JAXBElement<String> createLocationCity(String value) {
        return new JAXBElement<String>(_LocationProfileCity_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address2", scope = Location.class)
    public JAXBElement<String> createLocationAddress2(String value) {
        return new JAXBElement<String>(_LocationProfileAddress2_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddrElementAttribute5", scope = Location.class)
    public JAXBElement<String> createLocationAddrElementAttribute5(String value) {
        return new JAXBElement<String>(_LocationProfileAddrElementAttribute5_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "Address3", scope = Location.class)
    public JAXBElement<String> createLocationAddress3(String value) {
        return new JAXBElement<String>(_LocationProfileAddress3_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddressExpirationDate", scope = Location.class)
    public JAXBElement<XMLGregorianCalendar> createLocationAddressExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LocationAddressExpirationDate_QNAME, XMLGregorianCalendar.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "State", scope = Location.class)
    public JAXBElement<String> createLocationState(String value) {
        return new JAXBElement<String>(_LocationProfileState_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "LocationDirections", scope = Location.class)
    public JAXBElement<String> createLocationLocationDirections(String value) {
        return new JAXBElement<String>(_LocationLocationDirections_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "PostalPlus4Code", scope = Location.class)
    public JAXBElement<String> createLocationPostalPlus4Code(String value) {
        return new JAXBElement<String>(_LocationLocalePostalPlus4Code_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "ValidatedFlag", scope = Location.class)
    public JAXBElement<Boolean> createLocationValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_LocationValidatedFlag_QNAME, Boolean.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "AddressEffectiveDate", scope = Location.class)
    public JAXBElement<XMLGregorianCalendar> createLocationAddressEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LocationAddressEffectiveDate_QNAME, XMLGregorianCalendar.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "LastUpdateLogin", scope = Location.class)
    public JAXBElement<String> createLocationLastUpdateLogin(String value) {
        return new JAXBElement<String>(_LocationProfileLastUpdateLogin_QNAME, String.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "EffectiveDate", scope = Location.class)
    public JAXBElement<XMLGregorianCalendar> createLocationEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LocationEffectiveDate_QNAME, XMLGregorianCalendar.class, Location.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/", name = "GeometryStatusCode", scope = Location.class)
    public JAXBElement<String> createLocationGeometryStatusCode(String value) {
        return new JAXBElement<String>(_LocationGeometryStatusCode_QNAME, String.class, Location.class, value);
    }

}
