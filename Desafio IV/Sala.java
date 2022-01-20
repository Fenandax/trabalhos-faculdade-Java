public class Sala {
    
    private String materia;
    private String data;
    private int quantAlunos;

    public Sala (String materia, String data, int quantAlunos){
        this.materia = materia;
        this.data = data;
        this.quantAlunos = quantAlunos;
    }

    public String getMateria() {
        return materia;
    }
    public String getData() {
        return data;
    }
    public int getquantAlunos() {
        return quantAlunos;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setquantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public void reservaSala(){
        
        if(quantAlunos > 15){
            System.out.println("Devido as medidas de prevenção ao COVID 19, a quantidade de alunos solicitada não poderá ter aula ao mesmo tempo, sendo assim necessário dividir a turma por dias.");
        }
        else if(quantAlunos == 15){
            System.out.println("A sala tem a quantidade máxima de alunos permitida, lembre-se de não exceder essa quantidade. Ela foi reservada para o dia "+ data + " e para aula da matéria " + materia +".");
        }
        else{
            System.out.println("A sala está livre para o uso com a quantidade de alunos solicitada. Ela foi reservada para o dia "+ data + " e para aula da matéria " + materia + ". Lembre-se de atualizar caso ocorra aumento na turma.");
        }
    }
}