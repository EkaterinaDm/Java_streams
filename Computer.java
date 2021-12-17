package pr3;

class Computer<C,N> { //обобщенный класс
    C cost; //объявление объектов
    N name;
    
    Computer(C cost, N name) {//передача конструктору ссылки на объект
        this.cost = cost; 
        this.name = name;
    }

    void showCost() { //метод для вывода стоимости самого дешевого компьютера
        System.out.println("cамый дешевый компьютер. Стоимость: " + cost);
    }
    void showTypes() { //метод для вывода количества компьютеров заданного типа
        System.out.print("Количество компьютеров типа " + name + " - ");
    }
    
    C getcost() //метод для возврата значения стоимости
    {return cost;}
    N getname() //метод для возврата значения типа
    {return name;}
}
