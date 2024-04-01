package IC;

    public class NoteBook {

        String name;
        Integer ram;
        Integer rom;
        String os;
        String color;


        public NoteBook(String name, int ram, int rom, String os, String color){
            this.name = name;
            this.ram = ram;
            this.rom = rom;
            this.os = os;
            this.color = color;
        }


        @Override
        public String toString() {
            return String.format("Марка: %s \n Объем oперативной памяти: %d Гб \n объем накопителя %d Гб \n ОС %s \n Цвет %s \n", 
            name,ram,rom,os,color);
        }


        public String getName(){
            return this.name;
        }

        public Integer getRam(){
            return this.ram;
        }

        public Integer getRom(){
            return this.rom;
        }

        public String getOs(){
            return this.os;
        }

        public String getColor(){
            return this.color;
        }





    }
