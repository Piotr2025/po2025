public class Lotto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ile numerow");
        int ile = scanner.nextInt();
        System.out.println("A jakie numery obstawiasz musisz 6?");
        ArrayList<Integer> zaklad = new ArrayList<>();

        while(zaklad.size() < ile){
            int zm = scanner.nextInt();
            if(!zaklad.contains(zm) && zm > 0 && zm < 51){
                zaklad.add(zm);
            } else {
                System.out.println("Zly numer spróbuj jeszcze raz");
            }
        }

        int min = 1;
        int max = 50;
        ArrayList<Integer> draw2 = new ArrayList<>();
        int licznik = 1;
        long start = System.currentTimeMillis();
        long koniec = 0;

        while(!zaklad.equals(draw2)){
            draw2 = Losoj(min, max, ile);
            if(zaklad.equals(draw2)){
                System.out.println("wygrana za " + licznik + " razem! Wylosowane liczby: " + draw2);
                koniec = System.currentTimeMillis();
                break;
            }
            licznik++;
        }

        System.out.println("Czas dzialania: " + (koniec - start)/1000 + " sekund");
        scanner.close();
    }

    public static int GetNum(int min, int max){
        return (int)(Math.random() * (max - min + 1) + min);
    }

    public static ArrayList<Integer> Losoj(int min, int max, int ile){
        ArrayList<Integer> draw = new ArrayList<>();
        while(draw.size() < ile){
            int num = GetNum(min, max);
            if(!draw.contains(num)) draw.add(num);
        }
        return draw;
    }
}