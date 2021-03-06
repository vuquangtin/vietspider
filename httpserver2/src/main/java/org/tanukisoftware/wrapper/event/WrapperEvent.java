package org.tanukisoftware.wrapper.event;

/*
 * Copyright (c) 1999, 2006 Tanuki Software Inc.
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of the Java Service Wrapper and associated
 * documentation files (the "Software"), to deal in the Software
 * without  restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sub-license,
 * and/or sell copies of the Software, and to permit persons to
 * whom the Software is furnished to do so, subject to the
 * following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

import java.util.EventObject;

import org.tanukisoftware.wrapper.WrapperManager;

/**
 * WrapperEvents are used to notify WrapperEventListeners of various wrapper
 *  related events.
 * <p>
 * For performance reasons, some event instances may be reused by the code
 *  which fires them off.  For this reason, references to the event should
 *  never be referenced outside the scope of the WrapperListener.processEvent
 *  method.
 *
 * @author Leif Mortenson <leif@tanukisoftware.com>
 */
public abstract class WrapperEvent
    extends EventObject
{
    /*---------------------------------------------------------------
     * Constructors
     *-------------------------------------------------------------*/
    /**
     * Creates a new WrapperEvent.
     */
    protected WrapperEvent()
    {
        super( WrapperManager.class );
    }
    
    /*---------------------------------------------------------------
     * Methods
     *-------------------------------------------------------------*/
    /**
     * Returns a set of event flags for which the event should be fired.
     *  This value is compared with the mask supplied when when a
     *  WrapperEventListener is registered to decide which listeners should
     *  receive the event.
     * <p>
     * If a subclassed, the return value of the super class should usually
     *  be ORed with any additional flags.
     *
     * @return a set of event flags.
     */
    public long getFlags()
    {
        return 0;
    }
}
