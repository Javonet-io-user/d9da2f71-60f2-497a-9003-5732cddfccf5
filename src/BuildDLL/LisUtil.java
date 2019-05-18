package BuildDLL;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import BuildDLL.*;

public class LisUtil {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public static void setCharPlusSign(java.lang.Character value) {
    try {
      Javonet.getType("BuildDLL.LisUtil").set("CharPlusSign", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Character getCharPlusSign() {
    try {
      java.lang.Character res = Javonet.getType("BuildDLL.LisUtil").get("CharPlusSign");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCharSlash(java.lang.Character value) {
    try {
      Javonet.getType("BuildDLL.LisUtil").set("CharSlash", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Character getCharSlash() {
    try {
      java.lang.Character res = Javonet.getType("BuildDLL.LisUtil").get("CharSlash");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAppName() {
    try {
      java.lang.String res = Javonet.getType("BuildDLL.LisUtil").get("AppName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAppName(java.lang.String param) {
    try {
      Javonet.getType("BuildDLL.LisUtil").set("AppName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LisUtil() {
    try {
      javonetHandle = Javonet.New("BuildDLL.LisUtil");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LisUtil(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DecryptString(java.lang.String strData) {
    try {
      java.lang.String res = Javonet.getType("BuildDLL.LisUtil").invoke("DecryptString", strData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String EncryptString(java.lang.String strData) {
    try {
      java.lang.String res = Javonet.getType("BuildDLL.LisUtil").invoke("EncryptString", strData);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer ConvertBirthYearToAge(java.lang.String _number) {
    try {
      java.lang.Integer res =
          Javonet.getType("BuildDLL.LisUtil").invoke("ConvertBirthYearToAge", _number);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String getAgeByBirthDay(java.lang.String birthday) {
    try {
      java.lang.String res =
          Javonet.getType("BuildDLL.LisUtil").invoke("getAgeByBirthDay", birthday);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetSuperscript(java.lang.Integer digit) {
    try {
      java.lang.String res = Javonet.getType("BuildDLL.LisUtil").invoke("GetSuperscript", digit);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ReadRegistry(java.lang.String keyName) {
    try {
      java.lang.String res = Javonet.getType("BuildDLL.LisUtil").invoke("ReadRegistry", keyName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WriteRegistry(java.lang.String keyName, java.lang.String value) {
    try {
      Javonet.getType("BuildDLL.LisUtil").invoke("WriteRegistry", keyName, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ConvertTimeToNumber(java.lang.String strTime) {
    try {
      java.lang.String res =
          Javonet.getType("BuildDLL.LisUtil").invoke("ConvertTimeToNumber", strTime);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ConvertTimeFromString(java.lang.String strTime) {
    try {
      java.lang.String res =
          Javonet.getType("BuildDLL.LisUtil").invoke("ConvertTimeFromString", strTime);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ConvertString(java.lang.String data) {
    try {
      java.lang.String res = Javonet.getType("BuildDLL.LisUtil").invoke("ConvertString", data);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ConvertAgeToYear(java.lang.String _age) {
    try {
      java.lang.String res = Javonet.getType("BuildDLL.LisUtil").invoke("ConvertAgeToYear", _age);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ChuyenTVKhongDau(java.lang.String strVietNamese) {
    try {
      java.lang.String res =
          Javonet.getType("BuildDLL.LisUtil").invoke("ChuyenTVKhongDau", strVietNamese);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ConvertStringText(
      java.lang.String _Source, java.lang.Integer _TypeConvert) {
    try {
      java.lang.String res =
          Javonet.getType("BuildDLL.LisUtil").invoke("ConvertStringText", _Source, _TypeConvert);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ConvertStringText(
      java.lang.String _Source, java.lang.Integer _TypeConvert, java.lang.Integer _outputType) {
    try {
      java.lang.String res =
          Javonet.getType("BuildDLL.LisUtil")
              .invoke("ConvertStringText", _Source, _TypeConvert, _outputType);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String LaySTT(java.lang.Integer _num, java.lang.Integer _loai) {
    try {
      java.lang.String res = Javonet.getType("BuildDLL.LisUtil").invoke("LaySTT", _num, _loai);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToBase64(java.lang.Byte[] data) {
    try {
      java.lang.String res =
          Javonet.getType("BuildDLL.LisUtil").invoke("ToBase64", new Object[] {data});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Byte[] FromBase64(java.lang.String s, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("BuildDLL.LisUtil").invoke("FromBase64", s);
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
