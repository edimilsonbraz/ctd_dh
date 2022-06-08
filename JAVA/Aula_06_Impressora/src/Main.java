import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Impressora impressoraSemPapel = new Impressora(
                "HP",
                "Sem fio",
                // Pode também ser usado:
                // LocalDate.of(2022, 5, 25),
                // LocalDate.of(2022, Month.MAY, 25),
                // LocalDate.parse("2022-05-25"),
                // LocalDate.parse("25/05/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                // LocalDate.now() -> data corrente
                LocalDate.parse("2022-05-25")
        );

        Impressora impressoraComPapel = new Impressora(
                "Epson",
                "Sem fio",
                LocalDate.now(),
                10
        );

        impressoraSemPapel.setFolhasDisponiveis(2);
        impressoraSemPapel.imprimir("teste");
        impressoraComPapel.imprimir("teste2");
    }
}