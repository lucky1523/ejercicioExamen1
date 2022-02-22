package ejercicioRecuperacion;

public class BecaEstudio {

    Helpers helpers =  new Helpers();
    public BecaEstudio (Helpers objetoMock) { helpers = objetoMock;}

public String recomendacionBeca(int carnet){
        String message ="";
        if (Helpers.applicaBeca(carnet)){
            if(helpers.getNota(carnet)>=90){
                message = "SI APLICA A BECA";
            } else if (helpers.getNota(carnet)<90) {
                message = "NO APLICA A BECA POR PROMEDIO ACADEMICO";
            }
        } else {
            message = "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
        }
    return message;

}


}
