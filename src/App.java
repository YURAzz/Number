
public class App {
    public static void main(String[] args) throws Exception {
        String numero = "3928754829";
        checkphone(numero);
    }

    private static void checkphone(String telefono) {

        String checkphone = telefono;
        String[] str = checkphone.split("");
        String telefonocheck = "";
        checkphone = str[1];
        Boolean check = true;
        
        if (checkphone == "3" && telefono.length() == 10) {
            check = false;
        }
        if (check) {
            checkphone = checkphone + str[2];
            // for prefix 39
            if (checkphone.equals("39")) {
                for (int x = 3; x < str.length; x++) {
                    telefonocheck = telefonocheck + str[x];
                }
                telefono = telefonocheck;
            } else {
                // for prefix 0039
                checkphone = checkphone + str[3] + str[4];
                if (checkphone.equals("0039")) {
                    for (int x = 5; x < str.length; x++) {
                        telefonocheck = telefonocheck + str[x];
                    }
                    telefono = telefonocheck;
                }
            }
        }
    }
}
