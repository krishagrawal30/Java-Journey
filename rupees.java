class money {
    int r, p;

    money(int r, int p) {
        if (p > 0 && p < 100 && r > 0) {
            this.r = r;
            this.p = p;
        }
    }

    void add(money obj) {
        System.out.println(r + obj.r);
        System.out.println(p + obj.p);
    }

    void sub(money obj) {
        System.out.println(r - obj.r);
        System.out.println(p - obj.p);
    }

    double toDouble() {
        return (r + p * 0.01);
    }
}
class rupees {
    public static void main(String[] args) {
        money ob1 = new money(150, 50);
        money ob2 = new money(200, 25);
        ob1.add(ob2);
        ob1.sub(ob2);
        System.out.println(ob1.toDouble());
        System.out.println(ob2.toDouble());
    }
}