/*******************************************************************************
 * Copyright (c) 2006-2015
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Dresden, Amtsgericht Dresden, HRB 34001
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/

package org.emftext.language.java.resource.java.mopp;


/**
 * This exception is used to terminate generated parsers. Depending on the state
 * of a stop flag the parser throws this exception to break the control flow and
 * allow users of the parser to stop parsing.
 */
public class JavaTerminateParsingException extends RuntimeException {
	
	private static final long serialVersionUID = 117529647036954724L;
	
}