/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class HostedFilterList as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the HostedFilterListBean Interface. The CIM class HostedFilterList is described as
 * follows:
 * 
 * FilterLists are defined in the context of a ComputerSystem/ network device, where the list is used and administered.
 */
public class HostedFilterList extends HostedDependency implements Serializable
{

	/**
	 * This constructor creates a HostedFilterListBeanImpl Class which implements the HostedFilterListBean Interface, and encapsulates the CIM class
	 * HostedFilterList in a Java Bean. The CIM class HostedFilterList is described as follows:
	 * 
	 * FilterLists are defined in the context of a ComputerSystem/ network device, where the list is used and administered.
	 */
	public HostedFilterList() {
	};

	/**
	 * This method create an Association of the type HostedFilterList between one ComputerSystem object and FilterList object
	 */
	public static HostedFilterList link(ComputerSystem antecedent, FilterList
			dependent) {

		return (HostedFilterList) Association.link(HostedFilterList.class, antecedent, dependent);
	}// link

} // Class HostedFilterList