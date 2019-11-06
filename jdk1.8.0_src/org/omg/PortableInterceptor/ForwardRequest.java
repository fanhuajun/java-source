package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ForwardRequest.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-i586-cygwin/jdk8u191/11896/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Saturday, October 6, 2018 8:35:29 AM PDT
*/

public final class ForwardRequest extends org.omg.CORBA.UserException
{

  /** 
     * The new object to forward the request to.
     */
  public org.omg.CORBA.Object forward = null;

  public ForwardRequest ()
  {
    super(ForwardRequestHelper.id());
  } // ctor

  public ForwardRequest (org.omg.CORBA.Object _forward)
  {
    super(ForwardRequestHelper.id());
    forward = _forward;
  } // ctor


  public ForwardRequest (String $reason, org.omg.CORBA.Object _forward)
  {
    super(ForwardRequestHelper.id() + "  " + $reason);
    forward = _forward;
  } // ctor

} // class ForwardRequest
