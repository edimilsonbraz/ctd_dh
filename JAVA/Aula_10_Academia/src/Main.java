class Main {
    public static void main(String[] args) {
        AssociadoHabilitado habilitado = new AssociadoHabilitado
                (
                "1", "Pedro", 59.50, "Natação", 10.50
        );

        habilitado.setHabilitado(true);

        System.out.println(habilitado.toString());
    }
}
