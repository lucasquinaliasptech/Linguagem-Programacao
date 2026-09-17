package school.sptech.ex03;

public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public void definirData(Integer dia, Integer mes, Integer ano) {

        // array -> {31, diafev, 30, 31...}
        // Hashmap<Integer, Integer> map = new Hashmao<>();
        // for -> array.length -> map.put(i + 1, array[i))
        // if (map.get(mes) > dia) return;

        if (dia == null || mes == null || ano == null || dia < 0 || mes < 0 || ano < 0) {
            return;
        }

        if (dia < 1 || dia > 31) {
            return;
        }

        if (mes < 1 || mes > 12) {
            return;
        }

        Integer limiteDia = 31;

        if (mes == 2 && ano % 4 == 0) {
            limiteDia = 29;
        } else if (mes == 2) {
            limiteDia = 28;
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            limiteDia = 30;
        }

        if (dia > limiteDia) {
            return;
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String formatarData() {
        String stringDia = dia + "";
        String stringMes = mes + "";
        String stringAno = ano + "";

        if (dia < 10) {
            stringDia = "0" + dia;
        }

        if (mes < 10) {
            stringMes = "0" + mes;
        }

        if (ano < 1000) {
            stringAno = "0" + ano;
        }

        if (ano < 100) {
            stringAno = "00" + ano;
        }

        if (ano < 10) {
            stringAno = "000" + ano;
        }

        return stringDia + "/" + stringMes + "/" + stringAno;
    }

    public Integer compararDatas(Integer dia, Integer mes, Integer ano) {
        if (dia == null || mes == null || ano == null) {
            return null;
        }

        if (dia.equals(this.dia) && mes.equals(this.mes) && ano.equals(this.ano)) return 0;

        if (ano > this.ano) return 1;
        if (ano < this.ano) return -1;

        if ((mes + ano) > (this.mes + this.ano)) return 1;

        if ((dia + (mes * 10) + ano) > (this.dia + (this.mes * 10) + this.ano)) return 1;

        return -1;
    }

    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAno() {
        return ano;
    }
}
