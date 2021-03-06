/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.Serializable;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class VLANEndpoint as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the VLANEndpointBean Interface. The CIM class VLANEndpoint is described as follows:
 * 
 * An endpoint on a switch or endstation which is assigned to a given VLAN or accepts traffic from one or more VLANs. As defined by the property,
 * OperationalEndpointMode, the endpoint may be configured as trunking or nontrunking. Note that an endpoint may dynamically be converted to/from a
 * trunking mode. When this occurs, simply update the OperationalEndpointMode property. This class is associated with a DataLink or IPProtocol
 * Endpoint - as another aspect of that endpoint - using the LogicalIdentity relationship. In this case, the VLANEndpoint takes the role of
 * SameElement.
 */

public class VLANEndpoint extends ProtocolEndpoint implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 2489810476171193958L;
	private int	vlanID;

	public void setVlanID(int vlanID) {
		this.vlanID = vlanID;
	}

	public int getVlanID() {
		return vlanID;
	}

	/**
	 * This constructor creates a VLANEndpointBeanImpl Class which implements the VLANEndpointBean Interface, and encapsulates the CIM class
	 * VLANEndpoint in a Java Bean. The CIM class VLANEndpoint is described as follows:
	 * 
	 * An endpoint on a switch or endstation which is assigned to a given VLAN or accepts traffic from one or more VLANs. As defined by the property,
	 * OperationalEndpointMode, the endpoint may be configured as trunking or nontrunking. Note that an endpoint may dynamically be converted to/from
	 * a trunking mode. When this occurs, simply update the OperationalEndpointMode property. This class is associated with a DataLink or IPProtocol
	 * Endpoint - as another aspect of that endpoint - using the LogicalIdentity relationship. In this case, the VLANEndpoint takes the role of
	 * SameElement.
	 */
	public VLANEndpoint() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property DesiredEndpointMode.
	 */

	public enum DesiredEndpointMode {
		DMTF_RESERVED,
		OTHER,
		ACCESS,
		DYNAMIC_AUTO,
		DYNAMIC_DESIRABLE,
		TRUNK,
		DOT1Q_TUNNEL,
		DMTF_RESERVED1,
		VENDOR_RESERVED
	}

	private DesiredEndpointMode	desiredEndpointMode;

	/**
	 * This method returns the VLANEndpoint.desiredEndpointMode property value. This property is described as follows:
	 * 
	 * The desired VLAN mode that is requested for use. (Note that the current mode is given by the OperationalEndpointMode property.) The following
	 * values are defined: - Access: Puts the endpoint/switch port into permanent nontrunking mode and negotiates to convert the link into a nontrunk
	 * link. The endpoint becomes a nontrunk interface. - Dynamic Auto: Makes the endpoint able to convert the link to a trunk link. The endpoint
	 * becomes a trunk interface if the neighboring interface is set to trunk or desirable mode. - Dynamic Desirable: Makes the endpoint actively
	 * attempt to convert the link to a trunk link. The endpoint becomes a trunk interface if the neighboring interface is set to trunk, desirable, or
	 * auto mode. The default switch-port mode for all Ethernet interfaces is 'dynamic desirable.' - Trunk: Puts the endpoint into permanent trunking
	 * mode and negotiates to convert the link into a trunk link. The endpoint becomes a trunk interface even if the neighboring interface is not a
	 * trunk interface. - Dot1Q Tunnel: Configures the interface as a tunnel (nontrunking) endpoint/port to be connected in an asymmetric link with an
	 * 802.1Q trunk port. 802.1Q tunneling is used to maintain customer VLAN integrity across a service provider network.
	 * 
	 * @return int current desiredEndpointMode property value
	 * @exception Exception
	 */
	public DesiredEndpointMode getDesiredEndpointMode() {

		return this.desiredEndpointMode;
	} // getDesiredEndpointMode

	/**
	 * This method sets the VLANEndpoint.desiredEndpointMode property value. This property is described as follows:
	 * 
	 * The desired VLAN mode that is requested for use. (Note that the current mode is given by the OperationalEndpointMode property.) The following
	 * values are defined: - Access: Puts the endpoint/switch port into permanent nontrunking mode and negotiates to convert the link into a nontrunk
	 * link. The endpoint becomes a nontrunk interface. - Dynamic Auto: Makes the endpoint able to convert the link to a trunk link. The endpoint
	 * becomes a trunk interface if the neighboring interface is set to trunk or desirable mode. - Dynamic Desirable: Makes the endpoint actively
	 * attempt to convert the link to a trunk link. The endpoint becomes a trunk interface if the neighboring interface is set to trunk, desirable, or
	 * auto mode. The default switch-port mode for all Ethernet interfaces is 'dynamic desirable.' - Trunk: Puts the endpoint into permanent trunking
	 * mode and negotiates to convert the link into a trunk link. The endpoint becomes a trunk interface even if the neighboring interface is not a
	 * trunk interface. - Dot1Q Tunnel: Configures the interface as a tunnel (nontrunking) endpoint/port to be connected in an asymmetric link with an
	 * 802.1Q trunk port. 802.1Q tunneling is used to maintain customer VLAN integrity across a service provider network.
	 * 
	 * @param int new desiredEndpointMode property value
	 * @exception Exception
	 */
	public void setDesiredEndpointMode(DesiredEndpointMode
			desiredEndpointMode) {

		this.desiredEndpointMode = desiredEndpointMode;
	} // setDesiredEndpointMode

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherEndpointMode.
	 */
	private String	otherEndpointMode;

	/**
	 * This method returns the VLANEndpoint.otherEndpointMode property value. This property is described as follows:
	 * 
	 * A string describing the type of VLAN endpoint model that is supported by this VLANEndpoint, when the value of the mode property is set to 1
	 * (i.e., "Other"). This property should be set to NULL when the mode property is any value other than 1.
	 * 
	 * @return String current otherEndpointMode property value
	 * @exception Exception
	 */
	public String getOtherEndpointMode() {

		return this.otherEndpointMode;
	} // getOtherEndpointMode

	/**
	 * This method sets the VLANEndpoint.otherEndpointMode property value. This property is described as follows:
	 * 
	 * A string describing the type of VLAN endpoint model that is supported by this VLANEndpoint, when the value of the mode property is set to 1
	 * (i.e., "Other"). This property should be set to NULL when the mode property is any value other than 1.
	 * 
	 * @param String
	 *            new otherEndpointMode property value
	 * @exception Exception
	 */
	public void setOtherEndpointMode(String otherEndpointMode) {

		this.otherEndpointMode = otherEndpointMode;
	} // setOtherEndpointMode

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property OperationalEndpointMode.
	 */

	public enum OperationalEndpointMode {
		DMTF_RESERVED,
		OTHER,
		ACCESS,
		DYNAMIC_AUTO,
		DYNAMIC_DESIRABLE,
		TRUNK,
		DOT1Q_TUNNEL,
		DMTF_RESERVED1,
		VENDOR_RESERVED
	}

	private OperationalEndpointMode	operationalEndpointMode;

	/**
	 * This method returns the VLANEndpoint.operationalEndpointMode property value. This property is described as follows:
	 * 
	 * The configuration mode for the VLAN endpoint. The following values are defined: /n - Unknown: If the endpoint is not VLAN aware. /n - Access:
	 * Puts the endpoint into permanent nontrunking mode and negotiates to convert the link into a nontrunk link. The endpoint becomes a nontrunk
	 * interface. - Dynamic Auto: Makes the endpoint able to convert the link to a trunk link. The endpoint becomes a trunk interface if the
	 * neighboring interface is set to trunk or desirable mode. - Dynamic Desirable: Makes the endpoint actively attempt to convert the link to a
	 * trunk link. The endpoint becomes a trunk interface if the neighboring interface is set to trunk, desirable, or auto mode. The default
	 * switch-port mode for all Ethernet interfaces is 'dynamic desirable.' - Trunk: Puts the endpoint into permanent trunking mode and negotiates to
	 * convert the link into a trunk link. The endpoint becomes a trunk interface even if the neighboring interface is not a trunk interface. - Dot1Q
	 * Tunnel: Configures the interface as a tunnel (nontrunking) endpoint/port to be connected in an asymmetric link with an 802.1Q trunk port.
	 * 802.1Q tunneling is used to maintain customer VLAN integrity across a service provider network.
	 * 
	 * @return int current operationalEndpointMode property value
	 * @exception Exception
	 */
	public OperationalEndpointMode getOperationalEndpointMode() {

		return this.operationalEndpointMode;
	} // getOperationalEndpointMode

	/**
	 * This method sets the VLANEndpoint.operationalEndpointMode property value. This property is described as follows:
	 * 
	 * The configuration mode for the VLAN endpoint. The following values are defined: /n - Unknown: If the endpoint is not VLAN aware. /n - Access:
	 * Puts the endpoint into permanent nontrunking mode and negotiates to convert the link into a nontrunk link. The endpoint becomes a nontrunk
	 * interface. - Dynamic Auto: Makes the endpoint able to convert the link to a trunk link. The endpoint becomes a trunk interface if the
	 * neighboring interface is set to trunk or desirable mode. - Dynamic Desirable: Makes the endpoint actively attempt to convert the link to a
	 * trunk link. The endpoint becomes a trunk interface if the neighboring interface is set to trunk, desirable, or auto mode. The default
	 * switch-port mode for all Ethernet interfaces is 'dynamic desirable.' - Trunk: Puts the endpoint into permanent trunking mode and negotiates to
	 * convert the link into a trunk link. The endpoint becomes a trunk interface even if the neighboring interface is not a trunk interface. - Dot1Q
	 * Tunnel: Configures the interface as a tunnel (nontrunking) endpoint/port to be connected in an asymmetric link with an 802.1Q trunk port.
	 * 802.1Q tunneling is used to maintain customer VLAN integrity across a service provider network.
	 * 
	 * @param int new operationalEndpointMode property value
	 * @exception Exception
	 */
	public void setOperationalEndpointMode(OperationalEndpointMode
			operationalEndpointMode) {

		this.operationalEndpointMode = operationalEndpointMode;
	} // setOperationalEndpointMode

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property DesiredVLANTrunkEncapsulation.
	 */

	public enum DesiredVLANTrunkEncapsulation {
		DMTF_RESERVED,
		OTHER,
		NOT_APPLICABLE,
		_802_1Q,
		CISCO_ISL,
		NEGOTIATE,
		DMTF_RESERVED1,
		VENDOR_RESERVED
	}

	private DesiredVLANTrunkEncapsulation	desiredVLANTrunkEncapsulation;

	/**
	 * This method returns the VLANEndpoint.desiredVLANTrunkEncapsulation property value. This property is described as follows:
	 * 
	 * The type of VLAN encapsulation that is requested for use. (Note that the encapsulation currently in use is given by the
	 * OperationalVLANTrunkEncapsulation property.) Note that this property is only applicable when the endpoint is operating in a trunking mode (see
	 * the OperationalEndpointMode property for additional details). This property is either 'not applicable' (i.e., the endpoint will never be placed
	 * in a trunking mode), a particular type (802.1q or Cisco ISL), or 'negotiate' (i.e., the result of the negotiation between this interface and
	 * its neighbor). The value, 'Negotiate' is not allowed if the endpoint does not support negotiation. This capability is hardware and vendor
	 * dependent. Refer to the associated VLANEndpointCapabilities.doesTrunkEncapsulationNegotiation property to validate whether a particular
	 * endpoint (port) supports encapsulation negotiation.
	 * 
	 * @return int current desiredVLANTrunkEncapsulation property value
	 * @exception Exception
	 */
	public DesiredVLANTrunkEncapsulation getDesiredVLANTrunkEncapsulation() {

		return this.desiredVLANTrunkEncapsulation;
	} // getDesiredVLANTrunkEncapsulation

	/**
	 * This method sets the VLANEndpoint.desiredVLANTrunkEncapsulation property value. This property is described as follows:
	 * 
	 * The type of VLAN encapsulation that is requested for use. (Note that the encapsulation currently in use is given by the
	 * OperationalVLANTrunkEncapsulation property.) Note that this property is only applicable when the endpoint is operating in a trunking mode (see
	 * the OperationalEndpointMode property for additional details). This property is either 'not applicable' (i.e., the endpoint will never be placed
	 * in a trunking mode), a particular type (802.1q or Cisco ISL), or 'negotiate' (i.e., the result of the negotiation between this interface and
	 * its neighbor). The value, 'Negotiate' is not allowed if the endpoint does not support negotiation. This capability is hardware and vendor
	 * dependent. Refer to the associated VLANEndpointCapabilities.doesTrunkEncapsulationNegotiation property to validate whether a particular
	 * endpoint (port) supports encapsulation negotiation.
	 * 
	 * @param int new desiredVLANTrunkEncapsulation property value
	 * @exception Exception
	 */
	public void setDesiredVLANTrunkEncapsulation(DesiredVLANTrunkEncapsulation
			desiredVLANTrunkEncapsulation) {

		this.desiredVLANTrunkEncapsulation = desiredVLANTrunkEncapsulation;
	} // setDesiredVLANTrunkEncapsulation

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherTrunkEncapsulation.
	 */
	private String	otherTrunkEncapsulation;

	/**
	 * This method returns the VLANEndpoint.otherTrunkEncapsulation property value. This property is described as follows:
	 * 
	 * A string describing the type of VLAN encapsulation that is supported by this VLANEndpoint, when the value of the encapsulation property is set
	 * to 1 (i.e., "Other"). This property should be set to NULL when the desired encapsulation property is any value other than 1.
	 * 
	 * @return String current otherTrunkEncapsulation property value
	 * @exception Exception
	 */
	public String getOtherTrunkEncapsulation() {

		return this.otherTrunkEncapsulation;
	} // getOtherTrunkEncapsulation

	/**
	 * This method sets the VLANEndpoint.otherTrunkEncapsulation property value. This property is described as follows:
	 * 
	 * A string describing the type of VLAN encapsulation that is supported by this VLANEndpoint, when the value of the encapsulation property is set
	 * to 1 (i.e., "Other"). This property should be set to NULL when the desired encapsulation property is any value other than 1.
	 * 
	 * @param String
	 *            new otherTrunkEncapsulation property value
	 * @exception Exception
	 */
	public void setOtherTrunkEncapsulation(String otherTrunkEncapsulation) {

		this.otherTrunkEncapsulation = otherTrunkEncapsulation;
	} // setOtherTrunkEncapsulation

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property OperationalVLANTrunkEncapsulation.
	 */

	public enum OperationalVLANTrunkEncapsulation {
		UNKNOWN,
		OTHER,
		NOT_APPLICABLE,
		_802_1Q,
		CISCO_ISL,
		NEGOTIATING,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private OperationalVLANTrunkEncapsulation	operationalVLANTrunkEncapsulation;

	/**
	 * This method returns the VLANEndpoint.operationalVLANTrunkEncapsulation property value. This property is described as follows:
	 * 
	 * The type of VLAN encapsulation in use on a trunk endpoint/port. This property is either 'not applicable' (i.e., the endpoint is not operating
	 * in trunking mode), a particular type (802.1q or Cisco ISL), 'negotiating' (i.e., the endpoints are negotiating the encapsulation type). Note
	 * that this property is only applicable when the endpoint is operating in a trunking mode (see the OperationalEndpointMode property for
	 * additional details).
	 * 
	 * @return int current operationalVLANTrunkEncapsulation property value
	 * @exception Exception
	 */
	public OperationalVLANTrunkEncapsulation getOperationalVLANTrunkEncapsulation() {

		return this.operationalVLANTrunkEncapsulation;
	} // getOperationalVLANTrunkEncapsulation

	/**
	 * This method sets the VLANEndpoint.operationalVLANTrunkEncapsulation property value. This property is described as follows:
	 * 
	 * The type of VLAN encapsulation in use on a trunk endpoint/port. This property is either 'not applicable' (i.e., the endpoint is not operating
	 * in trunking mode), a particular type (802.1q or Cisco ISL), 'negotiating' (i.e., the endpoints are negotiating the encapsulation type). Note
	 * that this property is only applicable when the endpoint is operating in a trunking mode (see the OperationalEndpointMode property for
	 * additional details).
	 * 
	 * @param int new operationalVLANTrunkEncapsulation property value
	 * @exception Exception
	 */
	public void setOperationalVLANTrunkEncapsulation(OperationalVLANTrunkEncapsulation
			operationalVLANTrunkEncapsulation) {

		this.operationalVLANTrunkEncapsulation =
				operationalVLANTrunkEncapsulation;
	} // setOperationalVLANTrunkEncapsulation

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property GVRPStatus.
	 */

	public enum GVRPStatus {
		UNKNOWN,
		NOT_APPLICABLE,
		ENABLED,
		DISABLED
	}

	private GVRPStatus	gVRPStatus;

	/**
	 * This method returns the VLANEndpoint.gVRPStatus property value. This property is described as follows:
	 * 
	 * Indicates whether GARP VLAN Registration Protocol (GVRP) is enabled or disabled on the trunk endpoint/port. This property is 'not applicable'
	 * unless GVRP is supported by the endpoint. This is indicated in the Capabilities property, VLANEndpointCapabilities.Dot1QTagging. This property
	 * is applicable only when the endpoint is operating in trunking mode (determined by examining the SwitchEndpointMode property).
	 * 
	 * @return int current gVRPStatus property value
	 * @exception Exception
	 */
	public GVRPStatus getGVRPStatus() {

		return this.gVRPStatus;
	} // getGVRPStatus

	/**
	 * This method sets the VLANEndpoint.gVRPStatus property value. This property is described as follows:
	 * 
	 * Indicates whether GARP VLAN Registration Protocol (GVRP) is enabled or disabled on the trunk endpoint/port. This property is 'not applicable'
	 * unless GVRP is supported by the endpoint. This is indicated in the Capabilities property, VLANEndpointCapabilities.Dot1QTagging. This property
	 * is applicable only when the endpoint is operating in trunking mode (determined by examining the SwitchEndpointMode property).
	 * 
	 * @param int new gVRPStatus property value
	 * @exception Exception
	 */
	public void setGVRPStatus(GVRPStatus gVRPStatus) {

		this.gVRPStatus = gVRPStatus;
	} // setGVRPStatus

} // Class VLANEndpoint
