/*============================================================================*/
/*=====                                                                  =====*/
/*====    PPPP                     CCCC    AAA     EEEE                   ====*/
/*===     P   P                   C       A   A   E                        ===*/
/*==      P   P                   C       A   A   E                         ==*/
/*=       PPPP    rrrrr    ooo    C       AAAAA   EEE      ssss    ssss      =*/
/*==      P        rr     o   o   C       A   A   E       sss     sss       ==*/
/*===     P        r      o   o   C       A   A   E         sss     sss    ===*/
/*====    P        r       ooo     CCCC   A   A    EEEE   ssss    ssss    ====*/
/*=====                                                                  =====*/
/*============================================================================*/
/*                                                                            */
/*        ProCAEss GmbH                   email: Info@procaess.com            */
/*        Klaus-von-Klitzing-Str. 3       phone: +49 6341/954-183             */
/*        76829 Landau                    fax:   +49 6341/954-184             */
/*                                                                            */
/*============================================================================*/
/*                                                                            */
//  Project:    PJavaException
//  Source:     PJavaException.java
//  Language:   Java
//  Author:     $Author: dz $
//  Date:       $Date: 2003/07/02 11:57:57 $
//  Revision:   $Revision: 1.3 $
//  State:      $State: Exp $
/*                                                                            */
/*============================================================================*/
/*                                                                            */
/*    Package:                                                                */
/*    ========                                                                */
/*                                                                            */
package com.procaess.common2.utils;
/*                                                                            */
/*============================================================================*/
/*                                                                            */
/*    Import:                                                                 */
/*    =======                                                                 */
/*                                                                            */
/*                                                                            */

/** Provide an exception class for common2.
 *
 */
public class PJavaException extends Exception {
/*                                                                            */
/*----------------------------------------------------------------------------*/
/*                                                                            */
/** Konstruktor.
 *
 *  @param s error message of exception
 *                                                                            */
/*----------------------------------------------------------------------------*/
/*                                                                            */
  public PJavaException(String s) {
    super(s);
  }
/*                                                                            */
/*----------------------------------------------------------------------------*/
/*                                                                            */
/** Konstruktor.
 *
 *                                                                            */
/*----------------------------------------------------------------------------*/
/*                                                                            */
  public PJavaException() {
    super();
  }
/*                                                                            */
}
/*                                                                            */
/*============================================================================*/
/*============================================================================*/
