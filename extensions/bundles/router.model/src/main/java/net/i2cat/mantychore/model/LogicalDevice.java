/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.Serializable;
import java.util.List;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class LogicalDevice as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the LogicalDeviceBean Interface. The CIM class LogicalDevice is described as follows:
 * 
 * An abstraction or emulation of a hardware entity, that may or may not be Realized in physical hardware. Any characteristics of a LogicalDevice that
 * are used to manage its operation or configuration are contained in, or associated with, the LogicalDevice object. Examples of the operational
 * properties of a Printer would be paper sizes supported, or detected errors. Examples of the configuration properties of a Sensor Device would be
 * threshold settings. Various configurations could exist for a LogicalDevice. These configurations could be contained in Setting objects and
 * associated with the LogicalDevice.
 */
public class LogicalDevice extends EnabledLogicalElement implements
		Serializable {

	// FIXME, IT HAS TO INCLUDE ASSOCIATION (COMPOSITION) TO SYSTEM
	// TODO
	// public boolean addSystem(System system) {
	// if (system == null)
	// return false;
	// // Association a=getToAssociationByElement(logicalDevice);
	// // if (a == null){
	// // return (SystemDevice.link(this, logicalDevice) != null);
	// // }
	// // else{
	// //
	// // }
	//
	// return (SystemDevice.link(system, this) != null);
	// }
	//
	// public boolean removeLogicalDevice(System system) {
	//
	// if (system == null)
	// return false;
	// Association a = this.getToAssociationByElement(system);
	// if (a == null)
	// return false;
	// else {
	// a.unlink();
	// return true;
	// }
	// }
	//
	// public List<System> getSystem() {
	// return (List<System>) this.getToAssociatedElementsByType(SystemDevice.class);
	// }

	/**
	 * MANUALLY ADDED TO CIM (14/04/2011) <br>
	 * Adds a connection between this and given LogicalDevice.
	 * 
	 * 
	 * @param dstLogicalDevice
	 * @return true if connection has been added, false otherwise.
	 */
	public boolean addDeviceConnection(LogicalDevice dstLogicalDevice) {

		// check if it is already added
		Association a = this.getFirstToAssociationByTypeAndElement(DeviceConnection.class, dstLogicalDevice);
		if (a != null)
			return false;

		if (dstLogicalDevice == null)
			return false;
		return (DeviceConnection.link(this, dstLogicalDevice) != null);
	}

	/**
	 * MANUALLY ADDED TO CIM (14/04/2011)<br>
	 * Removes connection between this and given LogicalDevice.
	 * 
	 * @return true if connection has been removed, false otherwise.
	 */
	public boolean removeDeviceConnection(LogicalDevice dstLogicalDevice) {
		if (dstLogicalDevice == null)
			return false;
		Association a = this.getFirstToAssociationByTypeAndElement(DeviceConnection.class, dstLogicalDevice);
		if (a == null)
			return false;
		else {
			a.unlink();
			return true;
		}
	}

	/**
	 * MANUALLY ADDED TO CIM (14/04/2011)<br>
	 * Get LogicalDevices this Device is connected to.
	 * 
	 * @return list of LogicalDevices this is connected to.
	 */
	@SuppressWarnings("unchecked")
	public List<LogicalDevice> getOutgoingDeviceConnections() {
		return (List<LogicalDevice>) this.getToAssociatedElementsByType(DeviceConnection.class);
	}

	/**
	 * MANUALLY ADDED TO CIM (14/04/2011)<br>
	 * Get LogicalDevices connected to this device.
	 * 
	 * @return list of LogicalDevices connected to this.
	 */
	@SuppressWarnings("unchecked")
	public List<LogicalDevice> getIncomingDeviceConnections() {
		return (List<LogicalDevice>) this.getFromAssociatedElementsByType(DeviceConnection.class);
	}

	/**
	 * MANUALLY ADDED TO CIM (14/04/2011) <br>
	 * Adds given logicalPort to the association PortsOnDevice
	 * 
	 * @param logicalPort
	 * @return
	 */
	public boolean addPortOnDevice(LogicalPort logicalPort) {

		// TODO check if it is already added

		if (logicalPort == null)
			return false;
		return (PortOnDevice.link(this, logicalPort) != null);
	}

	/**
	 * MANUALLY ADDED TO CIM (14/04/2011)<br>
	 * Removes given logicalPort from the association PortsOnDevice
	 * 
	 * @return
	 */
	public boolean removePortOnDevice(LogicalPort logicalPort) {
		if (logicalPort == null)
			return false;
		Association a = this.getFirstToAssociationByTypeAndElement(PortOnDevice.class, logicalPort);
		if (a == null)
			return false;
		else {
			a.unlink();
			return true;
		}
	}

	/**
	 * MANUALLY ADDED TO CIM (14/04/2011)<br>
	 * Get LogicalPorts associated with this through PortsOnDevice.
	 * 
	 * @return list of ports on this device
	 */
	@SuppressWarnings("unchecked")
	public List<LogicalPort> getPortsOnDevice() {
		return (List<LogicalPort>) this.getToAssociatedElementsByType(PortOnDevice.class);
	}

	/**
	 * This constructor creates a LogicalDeviceBeanImpl Class which implements the LogicalDeviceBean Interface, and encapsulates the CIM class
	 * LogicalDevice in a Java Bean. The CIM class LogicalDevice is described as follows:
	 * 
	 * An abstraction or emulation of a hardware entity, that may or may not be Realized in physical hardware. Any characteristics of a LogicalDevice
	 * that are used to manage its operation or configuration are contained in, or associated with, the LogicalDevice object. Examples of the
	 * operational properties of a Printer would be paper sizes supported, or detected errors. Examples of the configuration properties of a Sensor
	 * Device would be threshold settings. Various configurations could exist for a LogicalDevice. These configurations could be contained in Setting
	 * objects and associated with the LogicalDevice.
	 */
	protected LogicalDevice() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property systemCreationClassName.
	 */
	private String	systemCreationClassName;

	/**
	 * This method returns the LogicalDevice.systemCreationClassName property value. This property is described as follows:
	 * 
	 * The scoping System's CreationClassName.
	 * 
	 * @return String current systemCreationClassName property value
	 * @exception Exception
	 */
	public String getSystemCreationClassName() {

		return this.systemCreationClassName;
	} // getSystemCreationClassName

	/**
	 * This method sets the LogicalDevice.systemCreationClassName property value. This property is described as follows:
	 * 
	 * The scoping System's CreationClassName.
	 * 
	 * @param String
	 *            new systemCreationClassName property value
	 * @exception Exception
	 */
	public void setSystemCreationClassName(String systemCreationClassName) {

		this.systemCreationClassName = systemCreationClassName;
	} // setSystemCreationClassName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property systemName.
	 */
	private String	systemName;

	/**
	 * This method returns the LogicalDevice.systemName property value. This property is described as follows:
	 * 
	 * The scoping System's Name.
	 * 
	 * @return String current systemName property value
	 * @exception Exception
	 */
	public String getSystemName() {

		return this.systemName;
	} // getSystemName

	/**
	 * This method sets the LogicalDevice.systemName property value. This property is described as follows:
	 * 
	 * The scoping System's Name.
	 * 
	 * @param String
	 *            new systemName property value
	 * @exception Exception
	 */
	public void setSystemName(String systemName) {

		this.systemName = systemName;
	} // setSystemName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property creationClassName.
	 */
	private String	creationClassName;

	/**
	 * This method returns the LogicalDevice.creationClassName property value. This property is described as follows:
	 * 
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties
	 * of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * 
	 * @return String current creationClassName property value
	 * @exception Exception
	 */
	public String getCreationClassName() {

		return this.creationClassName;
	} // getCreationClassName

	/**
	 * This method sets the LogicalDevice.creationClassName property value. This property is described as follows:
	 * 
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties
	 * of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * 
	 * @param String
	 *            new creationClassName property value
	 * @exception Exception
	 */
	public void setCreationClassName(String creationClassName) {

		this.creationClassName = creationClassName;
	} // setCreationClassName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property deviceID.
	 */
	private String	deviceID;

	/**
	 * This method returns the LogicalDevice.deviceID property value. This property is described as follows:
	 * 
	 * An address or other identifying information to uniquely name the LogicalDevice.
	 * 
	 * @return String current deviceID property value
	 * @exception Exception
	 */
	public String getDeviceID() {

		return this.deviceID;
	} // getDeviceID

	/**
	 * This method sets the LogicalDevice.deviceID property value. This property is described as follows:
	 * 
	 * An address or other identifying information to uniquely name the LogicalDevice.
	 * 
	 * @param String
	 *            new deviceID property value
	 * @exception Exception
	 */
	public void setDeviceID(String deviceID) {

		this.deviceID = deviceID;
	} // setDeviceID

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property powerManagementSupported.
	 */
	@Deprecated
	private boolean	powerManagementSupported;

	/**
	 * This method returns the LogicalDevice.powerManagementSupported property value. This property is described as follows:
	 * 
	 * Boolean indicating that the Device can be power managed. The use of this property has been deprecated. Instead, the existence of an associated
	 * PowerManagementCapabilities class (associated using the ElementCapabilities relationhip) indicates that power management is supported.
	 * 
	 * @return boolean current powerManagementSupported property value
	 * @exception Exception
	 */
	@Deprecated
	public boolean isPowerManagementSupported() {

		return this.powerManagementSupported;
	} // getPowerManagementSupported

	/**
	 * This method sets the LogicalDevice.powerManagementSupported property value. This property is described as follows:
	 * 
	 * Boolean indicating that the Device can be power managed. The use of this property has been deprecated. Instead, the existence of an associated
	 * PowerManagementCapabilities class (associated using the ElementCapabilities relationhip) indicates that power management is supported.
	 * 
	 * @param boolean new powerManagementSupported property value
	 * @exception Exception
	 */
	@Deprecated
	public void setPowerManagementSupported(boolean powerManagementSupported) {

		this.powerManagementSupported = powerManagementSupported;
	} // setPowerManagementSupported

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property PowerManagementCapabilities.
	 */
	@Deprecated
	public enum PowerManagementCapabilities {
		UNKNOWN,
		NOT_SUPPORTED,
		DISABLED,
		ENABLED,
		POWER_SAVING_MODES_ENTERED_AUTOMATICALLY,
		POWER_STATE_SETTABLE,
		POWER_CYCLING_SUPPORTED,
		TIMED_POWER_ON_SUPPORTED
	}

	@Deprecated
	private PowerManagementCapabilities	powerManagementCapabilities;

	/**
	 * This method returns the LogicalDevice.powerManagementCapabilities property value. This property is described as follows:
	 * 
	 * An enumerated array describing the power management capabilities of the Device. The use of this property has been deprecated. Instead, the
	 * PowerCapabilites property in an associated PowerManagementCapabilities class should be used.
	 * 
	 * @return int current powerManagementCapabilities property value
	 * @exception Exception
	 */
	@Deprecated
	public PowerManagementCapabilities getPowerManagementCapabilities() {

		return this.powerManagementCapabilities;
	} // getPowerManagementCapabilities

	/**
	 * This method sets the LogicalDevice.powerManagementCapabilities property value. This property is described as follows:
	 * 
	 * An enumerated array describing the power management capabilities of the Device. The use of this property has been deprecated. Instead, the
	 * PowerCapabilites property in an associated PowerManagementCapabilities class should be used.
	 * 
	 * @param int new powerManagementCapabilities property value
	 * @exception Exception
	 */
	@Deprecated
	public void setPowerManagementCapabilities(PowerManagementCapabilities
			powerManagementCapabilities) {

		this.powerManagementCapabilities = powerManagementCapabilities;
	} // setPowerManagementCapabilities

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property Availability.
	 */

	public enum Availability {
		OTHER,
		UNKNOWN,
		RUNNING_FULL_POWER,
		WARNING,
		IN_TEST,
		NOT_APPLICABLE,
		POWER_OFF,
		OFF_LINE,
		OFF_DUTY,
		DEGRADED,
		NOT_INSTALLED,
		INSTALL_ERROR,
		POWER_SAVE_UNKNOWN,
		POWER_SAVE_LOW_POWER_MODE,
		POWER_SAVE_STANDBY,
		POWER_CYCLE,
		POWER_SAVE_WARNING,
		PAUSED,
		NOT_READY,
		NOT_CONFIGURED,
		QUIESCED
	}

	private Availability	availability;

	/**
	 * This method returns the LogicalDevice.availability property value. This property is described as follows:
	 * 
	 * The primary availability and status of the Device. (Additional status information can be specified using the Additional Availability array
	 * property.) For example, the Availability property indicates that the Device is running and has full power (value=3), or is in a warning (4),
	 * test (5), degraded (10) or power save state (values 13-15 and 17). Regarding the Power Save states, these are defined as follows: Value 13
	 * ("Power Save - Unknown") indicates that the Device is known to be in a power save mode, but its exact status in this mode is unknown; 14
	 * ("Power Save - Low Power Mode") indicates that the Device is in a power save state but still functioning, and may exhibit degraded performance;
	 * 15 ("Power Save - Standby") describes that the Device is not functioning but could be brought to full power 'quickly'; and value 17
	 * ("Power Save - Warning") indicates that the Device is in a warning state, though also in a power save mode.
	 * 
	 * @return int current availability property value
	 * @exception Exception
	 */
	public Availability getAvailability() {

		return this.availability;
	} // getAvailability

	/**
	 * This method sets the LogicalDevice.availability property value. This property is described as follows:
	 * 
	 * The primary availability and status of the Device. (Additional status information can be specified using the Additional Availability array
	 * property.) For example, the Availability property indicates that the Device is running and has full power (value=3), or is in a warning (4),
	 * test (5), degraded (10) or power save state (values 13-15 and 17). Regarding the Power Save states, these are defined as follows: Value 13
	 * ("Power Save - Unknown") indicates that the Device is known to be in a power save mode, but its exact status in this mode is unknown; 14
	 * ("Power Save - Low Power Mode") indicates that the Device is in a power save state but still functioning, and may exhibit degraded performance;
	 * 15 ("Power Save - Standby") describes that the Device is not functioning but could be brought to full power 'quickly'; and value 17
	 * ("Power Save - Warning") indicates that the Device is in a warning state, though also in a power save mode.
	 * 
	 * @param int new availability property value
	 * @exception Exception
	 */
	public void setAvailability(Availability availability) {

		this.availability = availability;
	} // setAvailability

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property StatusInfo.
	 */
	@Deprecated
	public enum StatusInfo {
		OTHER,
		UNKNOWN,
		ENABLED,
		DISABLED,
		NOT_APPLICABLE
	}

	@Deprecated
	private StatusInfo	statusInfo;

	/**
	 * This method returns the LogicalDevice.statusInfo property value. This property is described as follows:
	 * 
	 * The StatusInfo property indicates whether the Logical Device is in an enabled (value = 3), disabled (value = 4) or some other (1) or unknown
	 * (2) state. If this property does not apply to the LogicalDevice, the value, 5 ("Not Applicable"), should be used. StatusInfo has been
	 * deprecated in lieu of a more clearly named property with additional enumerated values (EnabledState), that is inherited from
	 * ManagedSystemElement. If a Device is ("Enabled")(value=3), it has been powered up, and is configured and operational. The Device may or may not
	 * be functionally active, depending on whether its Availability (or AdditionalAvailability) indicate that it is ("Running/Full Power")(value=3)
	 * or ("Off line") (value=8). In an enabled but offline mode, a Device may be performing out-of-band requests, such as running Diagnostics. If
	 * ("Disabled") StatusInfo value=4), a Device can only be "enabled" or powered off. In a personal computer environment, ("Disabled") means that
	 * the Device's driver is not available in the stack. In other environments, a Device can be disabled by removing its configuration file. A
	 * disabled device is physically present in a System and consuming resources, but can not be communicated with until a load of a driver, a load of
	 * a configuration file or some other "enabling" activity has occurred.
	 * 
	 * @return int current statusInfo property value
	 * @exception Exception
	 */
	@Deprecated
	public StatusInfo getStatusInfo() {

		return this.statusInfo;
	} // getStatusInfo

	/**
	 * This method sets the LogicalDevice.statusInfo property value. This property is described as follows:
	 * 
	 * The StatusInfo property indicates whether the Logical Device is in an enabled (value = 3), disabled (value = 4) or some other (1) or unknown
	 * (2) state. If this property does not apply to the LogicalDevice, the value, 5 ("Not Applicable"), should be used. StatusInfo has been
	 * deprecated in lieu of a more clearly named property with additional enumerated values (EnabledState), that is inherited from
	 * ManagedSystemElement. If a Device is ("Enabled")(value=3), it has been powered up, and is configured and operational. The Device may or may not
	 * be functionally active, depending on whether its Availability (or AdditionalAvailability) indicate that it is ("Running/Full Power")(value=3)
	 * or ("Off line") (value=8). In an enabled but offline mode, a Device may be performing out-of-band requests, such as running Diagnostics. If
	 * ("Disabled") StatusInfo value=4), a Device can only be "enabled" or powered off. In a personal computer environment, ("Disabled") means that
	 * the Device's driver is not available in the stack. In other environments, a Device can be disabled by removing its configuration file. A
	 * disabled device is physically present in a System and consuming resources, but can not be communicated with until a load of a driver, a load of
	 * a configuration file or some other "enabling" activity has occurred.
	 * 
	 * @param int new statusInfo property value
	 * @exception Exception
	 */
	@Deprecated
	public void setStatusInfo(StatusInfo statusInfo) {

		this.statusInfo = statusInfo;
	} // setStatusInfo

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property lastErrorCode.
	 */
	@Deprecated
	private long	lastErrorCode;

	/**
	 * This method returns the LogicalDevice.lastErrorCode property value. This property is described as follows:
	 * 
	 * LastErrorCode captures the last error code reported by the LogicalDevice.
	 * 
	 * @return long current lastErrorCode property value
	 * @exception Exception
	 */
	@Deprecated
	public long getLastErrorCode() {

		return this.lastErrorCode;
	} // getLastErrorCode

	/**
	 * This method sets the LogicalDevice.lastErrorCode property value. This property is described as follows:
	 * 
	 * LastErrorCode captures the last error code reported by the LogicalDevice.
	 * 
	 * @param long new lastErrorCode property value
	 * @exception Exception
	 */
	@Deprecated
	public void setLastErrorCode(long lastErrorCode) {

		this.lastErrorCode = lastErrorCode;
	} // setLastErrorCode

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property errorDescription.
	 */
	@Deprecated
	private String	errorDescription;

	/**
	 * This method returns the LogicalDevice.errorDescription property value. This property is described as follows:
	 * 
	 * ErrorDescription is a free-form string supplying more information about the error recorded in LastErrorCode, and information on any corrective
	 * actions that may be taken.
	 * 
	 * @return String current errorDescription property value
	 * @exception Exception
	 */
	@Deprecated
	public String getErrorDescription() {

		return this.errorDescription;
	} // getErrorDescription

	/**
	 * This method sets the LogicalDevice.errorDescription property value. This property is described as follows:
	 * 
	 * ErrorDescription is a free-form string supplying more information about the error recorded in LastErrorCode, and information on any corrective
	 * actions that may be taken.
	 * 
	 * @param String
	 *            new errorDescription property value
	 * @exception Exception
	 */
	@Deprecated
	public void setErrorDescription(String errorDescription) {

		this.errorDescription = errorDescription;
	} // setErrorDescription

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property errorCleared.
	 */
	@Deprecated
	private boolean	errorCleared;

	/**
	 * This method returns the LogicalDevice.errorCleared property value. This property is described as follows:
	 * 
	 * ErrorCleared is a boolean property indicating that the error reported in LastErrorCode is now cleared.
	 * 
	 * @return boolean current errorCleared property value
	 * @exception Exception
	 */
	@Deprecated
	public boolean isErrorCleared() {

		return this.errorCleared;
	} // getErrorCleared

	/**
	 * This method sets the LogicalDevice.errorCleared property value. This property is described as follows:
	 * 
	 * ErrorCleared is a boolean property indicating that the error reported in LastErrorCode is now cleared.
	 * 
	 * @param boolean new errorCleared property value
	 * @exception Exception
	 */
	@Deprecated
	public void setErrorCleared(boolean errorCleared) {

		this.errorCleared = errorCleared;
	} // setErrorCleared

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property otherIdentifyingInfo.
	 */
	private String[]	otherIdentifyingInfo;

	/**
	 * This method returns the LogicalDevice.otherIdentifyingInfo property value. This property is described as follows:
	 * 
	 * OtherIdentifyingInfo captures additional data, beyond DeviceID information, that could be used to identify a LogicalDevice. One example would
	 * be to hold the Operating System's user friendly name for the Device in this property.
	 * 
	 * @return String[] current otherIdentifyingInfo property value
	 * @exception Exception
	 */
	public String[] getOtherIdentifyingInfo() {

		return this.otherIdentifyingInfo;
	} // getOtherIdentifyingInfo

	/**
	 * This method sets the LogicalDevice.otherIdentifyingInfo property value. This property is described as follows:
	 * 
	 * OtherIdentifyingInfo captures additional data, beyond DeviceID information, that could be used to identify a LogicalDevice. One example would
	 * be to hold the Operating System's user friendly name for the Device in this property.
	 * 
	 * @param String
	 *            [] new otherIdentifyingInfo property value
	 * @exception Exception
	 */
	public void setOtherIdentifyingInfo(String[] otherIdentifyingInfo) {

		this.otherIdentifyingInfo = otherIdentifyingInfo;
	} // setOtherIdentifyingInfo

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property powerOnHours.
	 */
	private long	powerOnHours;

	/**
	 * This method returns the LogicalDevice.powerOnHours property value. This property is described as follows:
	 * 
	 * The number of consecutive hours that this Device has been powered, since its last power cycle.
	 * 
	 * @return long current powerOnHours property value
	 * @exception Exception
	 */
	public long getPowerOnHours() {

		return this.powerOnHours;
	} // getPowerOnHours

	/**
	 * This method sets the LogicalDevice.powerOnHours property value. This property is described as follows:
	 * 
	 * The number of consecutive hours that this Device has been powered, since its last power cycle.
	 * 
	 * @param long new powerOnHours property value
	 * @exception Exception
	 */
	public void setPowerOnHours(long powerOnHours) {

		this.powerOnHours = powerOnHours;
	} // setPowerOnHours

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property totalPowerOnHours.
	 */
	private long	totalPowerOnHours;

	/**
	 * This method returns the LogicalDevice.totalPowerOnHours property value. This property is described as follows:
	 * 
	 * The total number of hours that this Device has been powered.
	 * 
	 * @return long current totalPowerOnHours property value
	 * @exception Exception
	 */
	public long getTotalPowerOnHours() {

		return this.totalPowerOnHours;
	} // getTotalPowerOnHours

	/**
	 * This method sets the LogicalDevice.totalPowerOnHours property value. This property is described as follows:
	 * 
	 * The total number of hours that this Device has been powered.
	 * 
	 * @param long new totalPowerOnHours property value
	 * @exception Exception
	 */
	public void setTotalPowerOnHours(long totalPowerOnHours) {

		this.totalPowerOnHours = totalPowerOnHours;
	} // setTotalPowerOnHours

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property identifyingDescriptions.
	 */
	private String[]	identifyingDescriptions;

	/**
	 * This method returns the LogicalDevice.identifyingDescriptions property value. This property is described as follows:
	 * 
	 * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifyingInfo array. Note, each entry of this
	 * array is related to the entry in OtherIdentifyingInfo that is located at the same index.
	 * 
	 * @return String[] current identifyingDescriptions property value
	 * @exception Exception
	 */
	public String[] getIdentifyingDescriptions() {

		return this.identifyingDescriptions;
	} // getIdentifyingDescriptions

	/**
	 * This method sets the LogicalDevice.identifyingDescriptions property value. This property is described as follows:
	 * 
	 * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifyingInfo array. Note, each entry of this
	 * array is related to the entry in OtherIdentifyingInfo that is located at the same index.
	 * 
	 * @param String
	 *            [] new identifyingDescriptions property value
	 * @exception Exception
	 */
	public void setIdentifyingDescriptions(String[] identifyingDescriptions) {

		this.identifyingDescriptions = identifyingDescriptions;
	} // setIdentifyingDescriptions

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property AdditionalAvailability.
	 */

	public enum AdditionalAvailability {
		OTHER,
		UNKNOWN,
		RUNNING_FULL_POWER,
		WARNING,
		IN_TEST,
		NOT_APPLICABLE,
		POWER_OFF,
		OFF_LINE,
		OFF_DUTY,
		DEGRADED,
		NOT_INSTALLED,
		INSTALL_ERROR,
		POWER_SAVE_UNKNOWN,
		POWER_SAVE_LOW_POWER_MODE,
		POWER_SAVE_STANDBY,
		POWER_CYCLE,
		POWER_SAVE_WARNING,
		PAUSED,
		NOT_READY,
		NOT_CONFIGURED,
		QUIESCED
	}

	private AdditionalAvailability	additionalAvailability;

	/**
	 * This method returns the LogicalDevice.additionalAvailability property value. This property is described as follows:
	 * 
	 * Additional availability and status of the Device, beyond that specified in the Availability property. The Availability property denotes the
	 * primary status and availability of the Device. In some cases, this will not be sufficient to denote the complete status of the Device. In those
	 * cases, the AdditionalAvailability property can be used to provide further information. For example, a Device's primary Availability may be
	 * "Off line" (value=8), but it may also be in a low power state (AdditonalAvailability value=14), or the Device could be running Diagnostics
	 * (AdditionalAvailability value=5, "In Test").
	 * 
	 * @return int current additionalAvailability property value
	 * @exception Exception
	 */
	public AdditionalAvailability getAdditionalAvailability() {

		return this.additionalAvailability;
	} // getAdditionalAvailability

	/**
	 * This method sets the LogicalDevice.additionalAvailability property value. This property is described as follows:
	 * 
	 * Additional availability and status of the Device, beyond that specified in the Availability property. The Availability property denotes the
	 * primary status and availability of the Device. In some cases, this will not be sufficient to denote the complete status of the Device. In those
	 * cases, the AdditionalAvailability property can be used to provide further information. For example, a Device's primary Availability may be
	 * "Off line" (value=8), but it may also be in a low power state (AdditonalAvailability value=14), or the Device could be running Diagnostics
	 * (AdditionalAvailability value=5, "In Test").
	 * 
	 * @param int new additionalAvailability property value
	 * @exception Exception
	 */
	public void setAdditionalAvailability(AdditionalAvailability
			additionalAvailability) {

		this.additionalAvailability = additionalAvailability;
	} // setAdditionalAvailability

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property maxQuiesceTime.
	 */
	@Deprecated
	private long	maxQuiesceTime;

	/**
	 * This method returns the LogicalDevice.maxQuiesceTime property value. This property is described as follows:
	 * 
	 * The MaxQuiesceTime property has been deprecated. When evaluating the use of Quiesce, it was determine that this single property is not adequate
	 * for describing when a device will automatically exit a quiescent state. In fact, the most likely scenario for a device to exit a quiescent
	 * state was determined to be based on the number of outstanding requests queued rather than on a maximum time. This will be re-evaluated and
	 * repositioned later. Maximum time in milliseconds, that a Device can run in a "Quiesced" state. A Device's state is defined in its Availability
	 * and AdditionalAvailability properties, where "Quiesced" is conveyed by the value 21. What occurs at the end of the time limit is
	 * device-specific. The Device may unquiesce, may offline or take other action. A value of 0 indicates that a Device can remain quiesced
	 * indefinitely.
	 * 
	 * @return long current maxQuiesceTime property value
	 * @exception Exception
	 */
	@Deprecated
	public long getMaxQuiesceTime() {

		return this.maxQuiesceTime;
	} // getMaxQuiesceTime

	/**
	 * This method sets the LogicalDevice.maxQuiesceTime property value. This property is described as follows:
	 * 
	 * The MaxQuiesceTime property has been deprecated. When evaluating the use of Quiesce, it was determine that this single property is not adequate
	 * for describing when a device will automatically exit a quiescent state. In fact, the most likely scenario for a device to exit a quiescent
	 * state was determined to be based on the number of outstanding requests queued rather than on a maximum time. This will be re-evaluated and
	 * repositioned later. Maximum time in milliseconds, that a Device can run in a "Quiesced" state. A Device's state is defined in its Availability
	 * and AdditionalAvailability properties, where "Quiesced" is conveyed by the value 21. What occurs at the end of the time limit is
	 * device-specific. The Device may unquiesce, may offline or take other action. A value of 0 indicates that a Device can remain quiesced
	 * indefinitely.
	 * 
	 * @param long new maxQuiesceTime property value
	 * @exception Exception
	 */
	@Deprecated
	public void setMaxQuiesceTime(long maxQuiesceTime) {

		this.maxQuiesceTime = maxQuiesceTime;
	} // setMaxQuiesceTime

} // Class LogicalDevice