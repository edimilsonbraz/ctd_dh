import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> jogadores = new ArrayList<String>();
        jogadores.add("Neymar Jr");
        jogadores.add("Vinicius Jr");
        jogadores.add("Daniel Alves");
        jogadores.add("Gabriel Jesus");
        System.out.println("------Percorrendo Jogadores---------");
        for(int i= 0; i < jogadores.size(); i++){
            System.out.println(jogadores.get(i));
        }

        System.out.println("------Array de Numeros---------");
        List<Number> primos = new ArrayList<Number>();
        primos.add(1);
        primos.add(3);
        primos.add(5);
        primos.add(7);
        primos.add(9);
        System.out.println(primos);

        System.out.println("------Removendo Jogadores---------");
        jogadores.remove("Daniel Alves");
        System.out.println(jogadores);
        System.out.println(jogadores.size());


        System.out.println("------Array de Clientes com LinkedList---------");

        List<String> cliente = new LinkedList<String>();
        cliente.add("Edimilson");
        cliente.add("Rodrigo");
        cliente.add("Felipe");
        cliente.add("Felipe");
        for(Object o : cliente) {
            System.out.println(o);
        }

        System.out.println("------Array de Container com HashSet---------");
        Set<String> container = new HashSet<String>();
        container.add("Container 1");
        container.add("Container 2");
        container.add("Container 3");
        container.add("Container 4");
        container.add("Container 5");
        container.remove("Container 2");
        for(Object o : container) {
            System.out.println(o);
        }
        System.out.println(container);

        System.out.println("------Array de Container com LinkedHastset---------");
        Set<Number> numeros = new LinkedHashSet<Number>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        System.out.println(numeros);

        System.out.println("------Array de Container com HashMap---------");
        Map<String, String> articlo = new HashMap<>();
        articlo.put("Key1", "value1");
        articlo.put("Key2", "value2");
        articlo.put("Key3", "value3");
        articlo.put("Key4", "value4");
        System.out.println(articlo);
        System.out.println(articlo.get("Key4"));

        System.out.println("------Array de Container com LinkedHashMap---------");
        Map<String, String> names = new LinkedHashMap<>();
        names.put("name1", "Edimilson");
        names.put("name2", "Eduardo");
        names.put("name3", "Inácio");
        names.put("name4", "Domingos");
        System.out.println(names);

        System.out.println("------Percorrendo TreeMap---------");
        Map<String, Number> treeMap = new TreeMap<>();
        treeMap.put("id1", 1);
        treeMap.put("id2", 2);
        treeMap.put("id3", 3);
        treeMap.put("id4", 4);
        treeMap.put("id5", 5);
        treeMap.put("id6", 6);
        System.out.println(treeMap);
        treeMap.remove("id3");
        System.out.println(treeMap);

        System.out.println("------Criando Objetos e passando p/ um ArrayList---------");

        List<Object> veiculos = new ArrayList<>();
        Caminhao caminhao = new Caminhao();
        Moto moto = new Moto();

        veiculos.add(caminhao);
        veiculos.add(moto);
        System.out.println(veiculos);


//        public void mostrarConteiners(){
//            Collections.sort(listaConteiner);
//
//            for(int i = 0; i < listaConteiner.size(); i++){
//                if (!listaConteiner.get(i).isEmbarcado()){
//                    System.out.println("Número: " + listaConteiner.get(i).getNumero() +
//                            "\tDescrição: " + listaConteiner.get(i).getDescricao());
//                }
//            }
//        }
//*********************************************
//        private ArrayList<Conteiner> listaConteiner = new ArrayList<>();
//        public void addConteiner(Conteiner conteiner){
//            listaConteiner.add(conteiner);
//        }
//        Vitor Carvalho21:56
//        public void mostrarConteiners(){
//            Collections.sort(listaConteiner);
//
//            for(int i = 0; i < listaConteiner.size(); i++){
//                if (!listaConteiner.get(i).isEmbarcado()){
//                    System.out.println("Número: " + listaConteiner.get(i).getNumero() +
//                            "\tDescrição: " + listaConteiner.get(i).getDescricao());
//                }
//            }
//        }

//        public void excluirProduto(String nomeProduto){
//
//            for(int i = 0; i < listaProduto.size(); i++)
//            {
//                Produto p = listaProduto.get(i);
//
//                if(p.getNome().equals(nomeProduto))
//                {
//                    // Encontrou um produto com a variável nomeProduto do parâmetro.
//
//                    // Remove.
//                    listaProduto.remove(p);
//
//                    // Sai do loop.
//                    break;
//                }
//            }
//            System.out.print("\nLista após remoção:\n")



//        List arrayList = new ArrayList();
//        arrayList.add("Juan");
//        arrayList.add("Mario");
//        arrayList.add("Carlos");
//        arrayList.add("Marcelo");
//        arrayList.add("Edimilson");
//
//
//
//        System.out.println("------Percorrendo ArrayList---------");
//        int i = 0;
//        for(i=0;i<arrayList.size();i++) {
//            System.out.println(arrayList.get(i));
//        }
//
//        System.out.println("------Percorrendo ArrayList con Iterator---------");
//
//        Iterator iterador = arrayList.iterator();
//        while(iterador.hasNext()) {
//            System.out.println(iterador.next());
//        }
//
//        System.out.println("------Percorrendo ArrayList con ForEach---------");
//
//        for(Object o: arrayList) {
//            System.out.println(o);
//        }
//
//
//
//        System.out.println("-------LinkedList--------");
//
//        List linkedList = new LinkedList();
//        linkedList.add("Juan");
//        linkedList.add("Mario");
//        linkedList.add("Carlos");
//        linkedList.add("Marcelo");
//        linkedList.add("Edimilson");
//
//        for(Object o :linkedList) {
//            System.out.println((String)o);
//        }
//
//
//
//        System.out.println("-------HashSet--------");
//
//        Set hashset = new HashSet();
//        hashset.add("Juan");
//        hashset.add("Mario");
//        hashset.add("Carlos");
//        hashset.add("Marcelo");
//        hashset.add("Edimilson");
//
//
//
//
//
//
//        for(Object o :hashset) {
//            System.out.println((String)o);
//        }
//
//        System.out.println("--------LinkedHashSet-------");
//
//
//        Set linkedhashset = new LinkedHashSet();
//        linkedhashset.add("Juan");
//        linkedhashset.add("Mario");
//        linkedhashset.add("Carlos");
//        linkedhashset.add("Marcelo");
//        linkedhashset.add("Marcelo");
//
//        for(Object o :linkedhashset) {
//            System.out.println((String)o);
//        }
//
//
//        System.out.println("--------TreeSet-------");
//
//
//        Set treeset = new TreeSet();
//        treeset.add("Juan");
//        treeset.add("Mario");
//        treeset.add("Carlos");
//        treeset.add("Marcelo");
//        treeset.add("Edimilson");
//
//
//
//        for(Object o :treeset) {
//            System.out.println((String)o);
//        }
//
//
//
//        System.out.println("--------HashMap-------");
//
//        Map hashmap = new HashMap();
//        hashmap.put(29888999,"Juan");
//        hashmap.put(30888999,"Mario");
//        hashmap.put(27888999,"Carlos");
//        hashmap.put(40888999,"Marcelo");
//        hashmap.put(50888999,"Edimilson");
//
//
//        System.out.println("--------Obter o nome do cpf 27888999 -------");
//        System.out.println(hashmap.get(27888999));
//
//        System.out.println("--------Percorrendo -------");
//        for(Object o :hashmap.values()) {
//            System.out.println((String)o);
//        }
//
//
//
//        System.out.println("--------LinkedHashMap-------");
//
//        Map linkedhashmap = new LinkedHashMap();
//        linkedhashmap.put(29888999,"Juan");
//        linkedhashmap.put(30888999,"Mario");
//        linkedhashmap.put(27888999,"Carlos");
//        linkedhashmap.put(40888999,"Marcelo");
//        linkedhashmap.put(50888999,"Edimilson");
//
//
//        System.out.println("--------Obter o nome do cpf 27888999 -------");
//        System.out.println(linkedhashmap.get(27888999));
//
//        System.out.println("--------Percorrendo -------");
//        for(Object o :linkedhashmap.values()) {
//            System.out.println((String)o);
//        }
//
//
//        System.out.println("--------TreeMap-------");
//
//        Map treemap = new TreeMap();
//        treemap.put(29888999,"Juan");
//        treemap.put(30888999,"Mario");
//        treemap.put(27888999,"Carlos");
//        treemap.put(40888999,"Marcelo");
//        treemap.put(50888999,"Edimilson");
//
//
//        System.out.println("--------Obter o nome do cpf 27888999 -------");
//        System.out.println(treemap.get(27888999));
//
//        System.out.println("--------Percorrendo -------");
//        for(Object o :treemap.values()) {
//            System.out.println((String)o);
//        }




    }
}