package clienteswconversor;

public class ClienteSWConversor {

    public static void main(String[] args) {
        int i = 100;
        System.out.println(i + " dolares son "+ dolEur(i)+" euros");
         System.out.println(i + " dolares son "+ dolLib(i)+" libras");
          System.out.println(i + " dolares son "+ dolPes(i)+" pesos");
    }

    private static double dolEur(double parametro) {
        clienteswconversor.SWConversor_Service service = new clienteswconversor.SWConversor_Service();
        clienteswconversor.SWConversor port = service.getSWConversorPort();
        return port.dolEur(parametro);
    }

    private static double dolLib(double parametro) {
        clienteswconversor.SWConversor_Service service = new clienteswconversor.SWConversor_Service();
        clienteswconversor.SWConversor port = service.getSWConversorPort();
        return port.dolLib(parametro);
    }

    private static double dolPes(double parametro) {
        clienteswconversor.SWConversor_Service service = new clienteswconversor.SWConversor_Service();
        clienteswconversor.SWConversor port = service.getSWConversorPort();
        return port.dolPes(parametro);
    }

}
