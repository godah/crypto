//-----BEGIN DISCLAIMER-----
/*******************************************************************************
* Copyright (c) 2017 JCrypTool Team and Contributors
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
//-----END DISCLAIMER-----
package org.jcryptool.visual.wots.files;



import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jcryptool.visual.wots.WotsView;

public class RestartHandler extends AbstractHandler {
    public Object execute(ExecutionEvent event) throws ExecutionException {
        if (HandlerUtil.getActivePart(event) instanceof WotsView) {
                WotsView view = ((WotsView) HandlerUtil.getActivePart(event));
                
                view.restart();
        }

        return null;
    }
}
