public class Parc {
    public String toString() {
        int count = 0;
        Vehicule[] vehicule = new Vehicule[3];
        vehicule[0] = new Vehicule(122, "Ford", "Fiesta", new String[]{"Disponible"});
        vehicule[1] = new Vehicule(220, "Audi", "A5", new String[]{"Disponible"});
        vehicule[2] = new Vehicule(230, "BMW", "Série 1", new String[]{"Disponible"});
        for (Vehicule v : vehicule) {
            System.out.println(v);
            count++;
        }
        return ("Le nombre des voitures est : " + count);
    }


}
