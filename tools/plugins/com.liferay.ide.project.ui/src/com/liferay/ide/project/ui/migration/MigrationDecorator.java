/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
 *******************************************************************************/
package com.liferay.ide.project.ui.migration;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;


/**
 * @author Gregory Amerson
 */
public class MigrationDecorator extends BaseLabelProvider implements ILightweightLabelDecorator
{

    @Override
    public void decorate( Object element, IDecoration decoration )
    {
        if( element instanceof MPTree )
        {
//            final MXMTree tree = (MXMTree) element;

//            decoration.addSuffix( " [" + new SimpleDateFormat().format( new Date( task.getTimestamp() ) ) + "]" );
        }
    }

}
