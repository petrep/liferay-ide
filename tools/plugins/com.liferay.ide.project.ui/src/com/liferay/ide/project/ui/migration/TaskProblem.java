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

import blade.migrate.api.Problem;

import java.io.File;


/**
 * @author Gregory Amerson
 */
public class TaskProblem extends Problem
{

    private boolean _resolved = false;
    private final long _timestamp;

    public TaskProblem()
    {
        super();

        _timestamp = System.currentTimeMillis();
    }

    public TaskProblem( Problem problem, boolean resolved )
    {
        super( problem.title, problem.url, problem.summary, problem.type, problem.ticket, problem.file,
               problem.lineNumber, problem.startOffset, problem.endOffset );

        _resolved = resolved;
        _timestamp = System.currentTimeMillis();
    }

    public TaskProblem(
        String title, String url, String summary, String type, String ticket, File file, int lineNumber,
        int startOffset, int endOffset, boolean resolved )
    {
        super( title, url, summary, type, ticket, file, lineNumber, startOffset, endOffset );

        _resolved = resolved;
        _timestamp = System.currentTimeMillis();
    }

    public TaskProblem(
        String title, String url, String summary, String type, String ticket, File file, int lineNumber,
        int startOffset, int endOffset, boolean resolved, long timestamp )
    {
        super( title, url, summary, type, ticket, file, lineNumber, startOffset, endOffset );

        _resolved = resolved;
        _timestamp = timestamp;
    }

    public long getTimestamp()
    {
        return _timestamp;
    }

    public boolean isResolved()
    {
        return _resolved;
    }

}
