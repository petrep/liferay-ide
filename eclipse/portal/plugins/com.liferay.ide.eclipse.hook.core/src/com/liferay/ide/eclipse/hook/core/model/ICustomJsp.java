/*******************************************************************************
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * Contributors:
 * 		Gregory Amerson - initial implementation and ongoing maintenance
 *******************************************************************************/

package com.liferay.ide.eclipse.hook.core.model;

import com.liferay.ide.eclipse.hook.core.model.internal.CustomJspPossibleValuesService;
import com.liferay.ide.eclipse.hook.core.model.internal.CustomJspValidationService;

import org.eclipse.sapphire.modeling.IModelElement;
import org.eclipse.sapphire.modeling.ModelElementType;
import org.eclipse.sapphire.modeling.Value;
import org.eclipse.sapphire.modeling.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.GenerateImpl;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.NoDuplicates;
import org.eclipse.sapphire.modeling.annotations.Service;
import org.eclipse.sapphire.modeling.annotations.Services;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

/**
 * @author Gregory Amerson
 */
@GenerateImpl
public interface ICustomJsp extends IModelElement
{
    ModelElementType TYPE = new ModelElementType( ICustomJsp.class );
    
	// *** Value ***
    
	@Label( standard = "Liferay Portal JSP" )
    @XmlBinding( path = "" )
	@NoDuplicates
	@Services( { @Service( impl = CustomJspPossibleValuesService.class ),
		@Service( impl = CustomJspValidationService.class ) } )
	ValueProperty PROP_VALUE = new ValueProperty( TYPE, "Value" );
    
	Value<String> getValue();

	void setValue( String value );
}
