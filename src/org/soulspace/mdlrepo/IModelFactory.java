/*
 *  Copyright (c) Ludger Solbach. All rights reserved.
 *  The use and distribution terms for this software are covered by the
 *  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *  which can be found in the file license.txt at the root of this distribution.
 *  By using this software in any fashion, you are agreeing to be bound by
 *  the terms of this license.
 *  You must not remove this notice, or any other, from this software.
 */
package org.soulspace.mdlrepo;

import org.soulspace.mdlrepo.metamodel.IActor;
import org.soulspace.mdlrepo.metamodel.IAssociation;
import org.soulspace.mdlrepo.metamodel.IAssociationClass;
import org.soulspace.mdlrepo.metamodel.IAssociationEnd;
import org.soulspace.mdlrepo.metamodel.IAttribute;
import org.soulspace.mdlrepo.metamodel.ICallAction;
import org.soulspace.mdlrepo.metamodel.ICallEvent;
import org.soulspace.mdlrepo.metamodel.IChangeEvent;
import org.soulspace.mdlrepo.metamodel.IClass;
import org.soulspace.mdlrepo.metamodel.ICreateAction;
import org.soulspace.mdlrepo.metamodel.IDataType;
import org.soulspace.mdlrepo.metamodel.IDependency;
import org.soulspace.mdlrepo.metamodel.IDestroyAction;
import org.soulspace.mdlrepo.metamodel.IEnumerationType;
import org.soulspace.mdlrepo.metamodel.IInterface;
import org.soulspace.mdlrepo.metamodel.IModel;
import org.soulspace.mdlrepo.metamodel.IMultiplicity;
import org.soulspace.mdlrepo.metamodel.IOperation;
import org.soulspace.mdlrepo.metamodel.IPackage;
import org.soulspace.mdlrepo.metamodel.IParameter;
import org.soulspace.mdlrepo.metamodel.ISendAction;
import org.soulspace.mdlrepo.metamodel.ISignalEvent;
import org.soulspace.mdlrepo.metamodel.IStateMachine;
import org.soulspace.mdlrepo.metamodel.IStereotype;
import org.soulspace.mdlrepo.metamodel.ITagDefinition;
import org.soulspace.mdlrepo.metamodel.ITaggedValue;
import org.soulspace.mdlrepo.metamodel.ITimeEvent;
import org.soulspace.mdlrepo.metamodel.IUseCase;
import org.soulspace.xmi.base.XmiObject;

/**
 * Interface
 * 
 * @author Solbach (Last update: $Author$, $Date$)
 * @version $Revision$
 */
public interface IModelFactory {

	IModelRepository getModelRepository();

	void setModelRepository(IModelRepository modelRepository);

	IModel createModel(XmiObject xmi);

	IPackage createPackage(XmiObject xmi);

	IClass createClass(XmiObject xmi);

	IAssociationClass createAssociationClass(XmiObject xmi);

	IDataType createDataType(XmiObject xmi);

	IEnumerationType createEnumerationType(XmiObject xmi);

	IAttribute createAttribute(XmiObject xmi);

	IOperation createOperation(XmiObject xmi);

	IParameter createParameter(XmiObject xmi);

	IInterface createInterface(XmiObject xmi);

	IAssociation createAssociation(XmiObject xmi);

	IAssociationEnd createAssociationEnd(XmiObject xmi);

	IStereotype createStereotype(XmiObject xmi);

	ITagDefinition createTagDefinition(XmiObject xmi);

	ITaggedValue createTaggedValue(XmiObject xmi);

	IMultiplicity createMultiplicity(XmiObject xmi);

	IDependency createDependency(XmiObject xmi);

	IUseCase createUseCase(XmiObject xmi);

	IActor createActor(XmiObject xmi);

	IStateMachine createStateMachine(XmiObject xmi);

	ICallEvent createCallEvent(XmiObject xmi);

	IChangeEvent createChangeEvent(XmiObject xmi);

	ISignalEvent createSignalEvent(XmiObject xmi);

	ITimeEvent createTimeEvent(XmiObject xmi);

	ICallAction createCallAction(XmiObject xmi);
	
	ICreateAction createCreateAction(XmiObject xmi);
	
	IDestroyAction createDestroyAction(XmiObject xmi);
	
	ISendAction createSendAction(XmiObject xmi);
	
	void processInclude(XmiObject xmi);

	void processExtend(XmiObject xmi);

	void processGeneralization(XmiObject xmi);

	void processAssociation(XmiObject xmi);

	void processStateMachine(XmiObject xmi);

}