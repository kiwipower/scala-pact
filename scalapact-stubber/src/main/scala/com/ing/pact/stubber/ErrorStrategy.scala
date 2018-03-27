package com.ing.pact.stubber

import java.util.ResourceBundle

trait ErrorStrategy[ErrorType, Data] extends (Seq[Either[ErrorType, Data]] => Seq[Data])


object ErrorStrategy extends Pimpers {
  def printErrorsAndUseGood[T: MessageFormatData, ErrorType, Data](key: String, t: T)(implicit resourceBundle: ResourceBundle, showable: Showable[ErrorType]): ErrorStrategy[ErrorType, Data] = new ErrorStrategy[ErrorType, Data] {

    def apply(seq: Seq[Either[ErrorType, Data]]) = {
      seq.issues match {
        case Seq() =>
        case issues => issues.printWithTitle(key, t)
      }
      seq.values
    }
  }

  def printErrorsAndAbort[T: MessageFormatData, ErrorType, Data](key: String, t: T)(implicit resourceBundle: ResourceBundle, showable: Showable[ErrorType]): ErrorStrategy[ErrorType, Data] = new ErrorStrategy[ErrorType, Data] {
    def apply(seq: Seq[Either[ErrorType, Data]]) = {
      seq.issues match {
        case Seq() => seq.values
        case issues => issues.printWithTitle(key, t); Seq()
      }
    }
  }

}
