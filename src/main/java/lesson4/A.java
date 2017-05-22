package lesson4;

import lesson4.lowPackage.B;

public class A extends B{
    public String publicFieldInA = "publicFieldInA";
    String fieldInA = "fieldInA";

    public String getProtectedField() {
        return this.protectedFieldInB;
    }


}
