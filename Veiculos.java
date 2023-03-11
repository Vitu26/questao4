public class Veiculos {
    public static void main(String[] args) {
        // Distância entre as cidades em km
        int distancia = 100;
        
        // Velocidade do carro em km/h
        int velocidadeCarro = 110;
        
        // Velocidade do caminhão em km/h
        int velocidadeCaminhao = 80;
        
        // Tempo extra do caminhão em cada pedágio em minutos
        int tempoPedagio = 5;
        
        // Distância percorrida pelo carro e pelo caminhão até o cruzamento
        double distanciaCarro = distancia / 2.0;
        double distanciaCaminhao = distancia / 2.0;
        
        // Tempo para o caminhão passar pelos dois pedágios em horas
        double tempoPedagioHoras = tempoPedagio / 60.0 / 60.0;
        
        // Tempo para o carro chegar no cruzamento em horas
        double tempoCarro = distanciaCarro / velocidadeCarro;
        
        // Tempo para o caminhão chegar no cruzamento em horas, considerando o tempo extra dos pedágios
        double tempoCaminhao = (distanciaCaminhao / velocidadeCaminhao) + (2 * tempoPedagioHoras);
        
        // Se o tempo do carro for menor, ele está mais próximo de Ribeirão Preto
        if (tempoCarro < tempoCaminhao) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        }
    }
}
