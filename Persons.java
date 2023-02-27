public class Persons {
   
        private String family;
        private String name;
        private String sex;
    
    
        public Persons(String family, String name, String sex) {
            this.family = family;
            this.name = name;
            this.sex = sex;
        }
    
    
    
    
        public String getFamily() {
            return this.family;
        }
    
        public void setFamily(String family) {
            this.family = family;
        }
    
        public String getName() {
            return this.name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getSex() {
            return this.sex;
        }
    
        public void setSex(String sex) {
            this.sex = sex;
        }
        
        @Override
        public String toString() {
            return "фамилия: " + family + ", " +
                    "имя: " + name + ", " +
                    "пол: " + sex;
            }
    
    
    
    }