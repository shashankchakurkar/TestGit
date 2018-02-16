
package com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule;

import java.math.BigDecimal;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.oracle.xmlns.adf.svc.types.FindControl;
import com.oracle.xmlns.adf.svc.types.FindCriteria;
import com.oracle.xmlns.adf.svc.types.MethodResult;
import com.oracle.xmlns.adf.svc.types.ObjAttrHints;
import com.oracle.xmlns.adf.svc.types.ProcessControl;
import com.oracle.xmlns.adf.svc.types.ProcessData;
import com.oracle.xmlns.adf.svc.types.ServiceViewInfo;
import com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.Location;
import com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LocationService", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/")
@XmlSeeAlso({
    com.oracle.xmlns.adf.svc.errors.ObjectFactory.class,
    com.oracle.xmlns.adf.svc.types.ObjectFactory.class,
    com.oracle.xmlns.apps.cdm.foundation.parties.flex.location.ObjectFactory.class,
    com.oracle.xmlns.apps.cdm.foundation.parties.flex.sourcesystemref.ObjectFactory.class,
    com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.ObjectFactory.class,
    com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.ObjectFactory.class,
    com.oracle.xmlns.apps.cdm.foundation.parties.partyservice.ObjectFactory.class,
    com.oracle.xmlns.oracleas.schema.oracle_fault_11_0.ObjectFactory.class,
    sdo.commonj.ObjectFactory.class,
    sdo.commonj.java.ObjectFactory.class,
    sdo.commonj.xml.ObjectFactory.class
})
public interface LocationService {


    /**
     * 
     * @param location
     * @return
     *     returns com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/createLocation")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "createLocation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.CreateLocation")
    @ResponseWrapper(localName = "createLocationResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.CreateLocationResponse")
    public LocationResult createLocation(
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        Location location)
        throws ServiceException
    ;

    /**
     * 
     * @param location
     * @return
     *     returns com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/updateLocation")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "updateLocation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.UpdateLocation")
    @ResponseWrapper(localName = "updateLocationResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.UpdateLocationResponse")
    public LocationResult updateLocation(
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        Location location)
        throws ServiceException
    ;

    /**
     * 
     * @param location
     * @return
     *     returns com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/mergeLocation")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "mergeLocation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.MergeLocation")
    @ResponseWrapper(localName = "mergeLocationResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.MergeLocationResponse")
    public LocationResult mergeLocation(
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        Location location)
        throws ServiceException
    ;

    /**
     * 
     * @param findCriteria
     * @param findControl
     * @return
     *     returns com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/findLocation")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "findLocation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.FindLocation")
    @ResponseWrapper(localName = "findLocationResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.FindLocationResponse")
    public LocationResult findLocation(
        @WebParam(name = "findCriteria", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        FindCriteria findCriteria,
        @WebParam(name = "findControl", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        FindControl findControl)
        throws ServiceException
    ;

    /**
     * 
     * @param processControl
     * @param location
     * @param changeOperation
     * @return
     *     returns com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/processLocation")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "processLocation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.ProcessLocation")
    @ResponseWrapper(localName = "processLocationResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.ProcessLocationResponse")
    public LocationResult processLocation(
        @WebParam(name = "changeOperation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String changeOperation,
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        List<Location> location,
        @WebParam(name = "processControl", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        ProcessControl processControl)
        throws ServiceException
    ;

    /**
     * 
     * @param bindOrigSystemReference
     * @param findCriteria
     * @param bindOrigSystem
     * @param findControl
     * @return
     *     returns com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getLocationByOriginalSystemReference")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "getLocationByOriginalSystemReference", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetLocationByOriginalSystemReference")
    @ResponseWrapper(localName = "getLocationByOriginalSystemReferenceResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetLocationByOriginalSystemReferenceResponse")
    public LocationResult getLocationByOriginalSystemReference(
        @WebParam(name = "findCriteria", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        FindCriteria findCriteria,
        @WebParam(name = "bindOrigSystem", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String bindOrigSystem,
        @WebParam(name = "bindOrigSystemReference", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String bindOrigSystemReference,
        @WebParam(name = "findControl", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        FindControl findControl)
        throws ServiceException
    ;

    /**
     * 
     * @param location
     * @return
     *     returns com.oracle.xmlns.adf.svc.types.MethodResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/deleteLocation")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "deleteLocation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.DeleteLocation")
    @ResponseWrapper(localName = "deleteLocationResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.DeleteLocationResponse")
    public MethodResult deleteLocation(
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        Location location)
        throws ServiceException
    ;

    /**
     * 
     * @param processData
     * @param processControl
     * @return
     *     returns com.oracle.xmlns.adf.svc.types.ProcessData
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/processCSLocation")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "processCSLocation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.ProcessCSLocation")
    @ResponseWrapper(localName = "processCSLocationResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.ProcessCSLocationResponse")
    public ProcessData processCSLocation(
        @WebParam(name = "processData", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        ProcessData processData,
        @WebParam(name = "processControl", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        ProcessControl processControl)
        throws ServiceException
    ;

    /**
     * 
     * @param bindOrigSystemReference
     * @param findCriteria
     * @param bindOrigSystem
     * @param findControl
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getLocationByOriginalSystemReferenceAsync")
    @Oneway
    @RequestWrapper(localName = "getLocationByOriginalSystemReferenceAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetLocationByOriginalSystemReferenceAsync")
    public void getLocationByOriginalSystemReferenceAsync(
        @WebParam(name = "findCriteria", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        FindCriteria findCriteria,
        @WebParam(name = "bindOrigSystem", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String bindOrigSystem,
        @WebParam(name = "bindOrigSystemReference", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String bindOrigSystemReference,
        @WebParam(name = "findControl", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        FindControl findControl);

    /**
     * 
     * @param processData
     * @param processControl
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/processCSLocationAsync")
    @Oneway
    @RequestWrapper(localName = "processCSLocationAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.ProcessCSLocationAsync")
    public void processCSLocationAsync(
        @WebParam(name = "processData", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        ProcessData processData,
        @WebParam(name = "processControl", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        ProcessControl processControl);

    /**
     * 
     * @param location
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/mergeLocationAsync")
    @Oneway
    @RequestWrapper(localName = "mergeLocationAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.MergeLocationAsync")
    public void mergeLocationAsync(
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        Location location);

    /**
     * 
     * @param processControl
     * @param location
     * @param changeOperation
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/processLocationAsync")
    @Oneway
    @RequestWrapper(localName = "processLocationAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.ProcessLocationAsync")
    public void processLocationAsync(
        @WebParam(name = "changeOperation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String changeOperation,
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        List<Location> location,
        @WebParam(name = "processControl", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        ProcessControl processControl);

    /**
     * 
     * @param location
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/deleteLocationAsync")
    @Oneway
    @RequestWrapper(localName = "deleteLocationAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.DeleteLocationAsync")
    public void deleteLocationAsync(
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        Location location);

    /**
     * 
     * @param findCriteria
     * @param findControl
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/findLocationAsync")
    @Oneway
    @RequestWrapper(localName = "findLocationAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.FindLocationAsync")
    public void findLocationAsync(
        @WebParam(name = "findCriteria", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        FindCriteria findCriteria,
        @WebParam(name = "findControl", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        FindControl findControl);

    /**
     * 
     * @param location
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/updateLocationAsync")
    @Oneway
    @RequestWrapper(localName = "updateLocationAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.UpdateLocationAsync")
    public void updateLocationAsync(
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        Location location);

    /**
     * 
     * @param location
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/createLocationAsync")
    @Oneway
    @RequestWrapper(localName = "createLocationAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.CreateLocationAsync")
    public void createLocationAsync(
        @WebParam(name = "location", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        Location location);

    /**
     * 
     * @param locationId
     * @return
     *     returns com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.Location
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getLocation")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "getLocation", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetLocation")
    @ResponseWrapper(localName = "getLocationResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetLocationResponse")
    public Location getLocation(
        @WebParam(name = "locationId", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        long locationId)
        throws ServiceException
    ;

    /**
     * 
     * @param locationId
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getLocationAsync")
    @Oneway
    @RequestWrapper(localName = "getLocationAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetLocationAsync")
    public void getLocationAsync(
        @WebParam(name = "locationId", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        long locationId);

    /**
     * 
     * @param distance
     * @param unitOfMeasure
     * @param latitude
     * @param longitude
     * @return
     *     returns com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.LocationResult
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getNearByLocations")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "getNearByLocations", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetNearByLocations")
    @ResponseWrapper(localName = "getNearByLocationsResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetNearByLocationsResponse")
    public LocationResult getNearByLocations(
        @WebParam(name = "latitude", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        BigDecimal latitude,
        @WebParam(name = "longitude", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        BigDecimal longitude,
        @WebParam(name = "distance", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        BigDecimal distance,
        @WebParam(name = "unitOfMeasure", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String unitOfMeasure)
        throws ServiceException
    ;

    /**
     * 
     * @param distance
     * @param unitOfMeasure
     * @param latitude
     * @param longitude
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getNearByLocationsAsync")
    @Oneway
    @RequestWrapper(localName = "getNearByLocationsAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetNearByLocationsAsync")
    public void getNearByLocationsAsync(
        @WebParam(name = "latitude", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        BigDecimal latitude,
        @WebParam(name = "longitude", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        BigDecimal longitude,
        @WebParam(name = "distance", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        BigDecimal distance,
        @WebParam(name = "unitOfMeasure", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String unitOfMeasure);

    /**
     * 
     * @param viewName
     * @param localeName
     * @return
     *     returns com.oracle.xmlns.adf.svc.types.ObjAttrHints
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getDfltObjAttrHints")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "getDfltObjAttrHints", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetDfltObjAttrHints")
    @ResponseWrapper(localName = "getDfltObjAttrHintsResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetDfltObjAttrHintsResponse")
    public ObjAttrHints getDfltObjAttrHints(
        @WebParam(name = "viewName", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String viewName,
        @WebParam(name = "localeName", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String localeName)
        throws ServiceException
    ;

    /**
     * 
     * @return
     *     returns javax.xml.datatype.XMLGregorianCalendar
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getServiceLastUpdateTime")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "getServiceLastUpdateTime", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetServiceLastUpdateTime")
    @ResponseWrapper(localName = "getServiceLastUpdateTimeResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetServiceLastUpdateTimeResponse")
    public XMLGregorianCalendar getServiceLastUpdateTime()
        throws ServiceException
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.oracle.xmlns.adf.svc.types.ServiceViewInfo>
     * @throws ServiceException
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getEntityList")
    @WebResult(name = "result", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
    @RequestWrapper(localName = "getEntityList", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetEntityList")
    @ResponseWrapper(localName = "getEntityListResponse", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetEntityListResponse")
    public List<ServiceViewInfo> getEntityList()
        throws ServiceException
    ;

    /**
     * 
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getEntityListAsync")
    @Oneway
    @RequestWrapper(localName = "getEntityListAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetEntityListAsync")
    public void getEntityListAsync();

    /**
     * 
     * @param viewName
     * @param localeName
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getDfltObjAttrHintsAsync")
    @Oneway
    @RequestWrapper(localName = "getDfltObjAttrHintsAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetDfltObjAttrHintsAsync")
    public void getDfltObjAttrHintsAsync(
        @WebParam(name = "viewName", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String viewName,
        @WebParam(name = "localeName", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/")
        String localeName);

    /**
     * 
     */
    @WebMethod(action = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/getServiceLastUpdateTimeAsync")
    @Oneway
    @RequestWrapper(localName = "getServiceLastUpdateTimeAsync", targetNamespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/locationService/applicationModule/types/", className = "com.oracle.xmlns.apps.cdm.foundation.parties.locationservice.applicationmodule.types.GetServiceLastUpdateTimeAsync")
    public void getServiceLastUpdateTimeAsync();

}