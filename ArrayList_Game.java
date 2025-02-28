import java.util.*;
class Game{
    int num;
    int player;
    int price;
    String name;
    public Game(int num, String name, int player,int price)
    {
        this.num = num;
        this.name = name;
        this.player = player;
        this. price = price;
    } 
    public String getname()
    {
        return name;
    }
    public int getplayer()
    {
        return player;
    }
    public String toString()
    {
        //return "Game : "+name+"\tNo. of Players : "+player+"\tPrice : "+price;
        return String.format("%s, %d, %d", name, player, price);
    }
}
public class ArrayList_Game
{
    public static void main(String[] args) {
        Game g1 = new Game(1,"Chess.com", 2, 200);
        Game g2 = new Game(2,"Ludo", 4, 50);
        Game g3 = new Game(3,"Challenge", 3, 150);
        Game g4 = new Game(4,"Ludo", 7, 100);
        List<Game> game = new ArrayList<>();
        game.add(g1);
        game.add(g2);
        game.add(g3);
        game.add(g4);
        Collections.sort(game, new Comparator<Game>()
                            {
                                public int compare(Game a, Game b)
                                {
                                    int comparer = a.getname().compareTo(b.getname());
                                    if(comparer!=0)
                                    {
                                        return comparer;
                                    }
                                    else
                                    {
                                        return Integer.compare(b.getplayer() , a.getplayer());
                                    }
                                }
                            }
                        );
        ListIterator<Game> i = game.listIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        } 
    }
}