import java.util.Scanner;

public class Maindois {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Boa tarde! Somos a ComputerFY e estamos aqui para te ajudar a escolher o melhor computador para você! ");
        System.out.println("");
        System.out.println("Vamos analisar suas necessidades e mostrar a máquina perfeita para você! Digite 1 para prosseguir...");

        int resposta = myObj.nextInt();

        if (resposta == 1) {
            System.out.println("Vamos lá!");

            System.out.println("===============");

            System.out.println("");
            System.out.println("Pretende usar a máquina para:");
            System.out.println("");
            System.out.println("Escritório, Redes Sociais, Estudos... [1]");
            System.out.println("Jogos leves/médios...  [2]");
            System.out.println("Jogos pesados, Edição de Vídeos/Imagens...  [3]");

            System.out.println("");

            int utilidade = myObj.nextInt();

            if (utilidade == 1) {
                System.out.println("Qual o preço estimado da sua máquina?");
                System.out.println("");
                System.out.println("R$1.000,00 - R$1.200,00 [1]");
                System.out.println("R$1.300,00 - R$1,500,00 [2]");
                System.out.println("Mais de R$1.500,00 [3]");

                int valor = myObj.nextInt();

                System.out.println("");
                System.out.println("Disponibilizamos duas marcas de processadores!");
                System.out.println("Intel [1]");
                System.out.println("Ryzen [2]");
                System.out.println("");
                System.out.println("Qual sua preferência?");
                System.out.println("");

                int marca = myObj.nextInt();

                if (valor == 1 && marca == 2) {
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD Phenom ii X2 555 3.1Ghz ");
                    System.out.println("RAM: 4Gb RAM  ");
                    System.out.println("Armazenamento: SSD 240GB  ");
                    System.out.println("");
                    System.out.println("Total = R$1.000,00");

                }

                if (valor == 2 && marca == 2) {
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD Athlon 3000G ");
                    System.out.println("RAM: 8GB DDR4 ");
                    System.out.println("Armazenamento: SSD 240GB  ");
                    System.out.println("");
                    System.out.println("Total = R$1.500,00");

                }

                if (valor == 3 && marca == 2) {
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD Ryzen 3 3200G ");
                    System.out.println("RAM: 8GB DDR4 ");
                    System.out.println("Armazenamento: SSD 120GB  ");
                    System.out.println("");
                    System.out.println("Total = R$1.600,00");

                }

                if (valor == 1 && marca == 1) {
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel Core I5 ");
                    System.out.println("RAM: 8GB DDR4 ");
                    System.out.println("Armazenamento: SSD 240GB  ");
                    System.out.println("");
                    System.out.println("Total = R$1.200,00");

                }

                if (valor == 2 && marca == 1) {
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel Core I5 ");
                    System.out.println("RAM: 8GB DDR3 ");
                    System.out.println("Armazenamento: SSD 480GB  ");
                    System.out.println("");
                    System.out.println("Total = R$1.400,00");

                }

                if (valor == 3 && marca == 1) {
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel Core I5 ");
                    System.out.println("RAM: 8GB DDR4 ");
                    System.out.println("Armazenamento: HD 1TB  ");
                    System.out.println("");
                    System.out.println("Total = R$1.700,00");

                }

            } if (utilidade == 2){

                System.out.println("Qual o preço estimado da sua máquina?");
                System.out.println("");
                System.out.println("R$2.300,00 - R$2.500,00 [1]");
                System.out.println("R$2.500,00 - R$2.700,00 [2]");
                System.out.println("Mais de R$2.700,00 [3]");
                System.out.println("");

                int valor = myObj.nextInt();

                System.out.println("");
                System.out.println("Disponibilizamos duas marcas!");
                System.out.println("Intel [1]");
                System.out.println("Ryzen [2]");
                System.out.println("");
                System.out.println("Qual sua preferência?");
                System.out.println("");

                int marca = myObj.nextInt();

                if ( valor == 1 && marca == 1){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel i5-3470 ");
                    System.out.println("Placa de Vídeo: Radeon RX 550 4GB ");
                    System.out.println("RAM: 8GB DDR3 ");
                    System.out.println("Armazenamento: SSD 240GB  ");
                    System.out.println("");
                    System.out.println("Total = R$2.500,00");
                }

                if ( valor == 2 && marca == 1){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel i3-10100F ");
                    System.out.println("Placa de Vídeo: Radeon RX 550 4GB ");
                    System.out.println("RAM: 8GB DDR4 ");
                    System.out.println("Armazenamento: SSD 240GB  ");
                    System.out.println("");
                    System.out.println("Total = R$2.700,00");
                }

                if ( valor == 3 && marca == 1){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel i3-3240 ");
                    System.out.println("Placa de Vídeo: GeForce GTX 1050 TI 4GB ");
                    System.out.println("RAM: 16GB GDDR6 ");
                    System.out.println("Armazenamento: SSD 240GB  ");
                    System.out.println("");
                    System.out.println("Total = R$2.800,00");
                }

                if ( valor == 1 && marca == 2){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD 4700S ");
                    System.out.println("Placa de Vídeo: Geforce GT 1030 2GB ");
                    System.out.println("RAM: 16GB GDDR6  ");
                    System.out.println("Armazenamento: SSD 240GB  ");
                    System.out.println("");
                    System.out.println("Total = R$2.600,00");
                }

                if ( valor == 2 && marca == 2){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD 4700S ");
                    System.out.println("Placa de Vídeo: Radeon RX 550 4GB ");
                    System.out.println("RAM: 8GB DDR4  ");
                    System.out.println("Armazenamento: SSD 480GB  ");
                    System.out.println("");
                    System.out.println("Total = R$2.700,00");
                }

                if ( valor == 3 && marca == 2){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD Ryzen 5 4650G ");
                    System.out.println("Placa de Vídeo: Radeon RX 550 4GB ");
                    System.out.println("RAM: 16GB DDR4  ");
                    System.out.println("Armazenamento: HD 1TB  ");
                    System.out.println("");
                    System.out.println("Total = R$2.900,00");
                }
            }

            if (utilidade == 3){
                System.out.println("Qual o preço estimado da sua máquina?");
                System.out.println("");
                System.out.println("R$5.800,00 - R$5.900,00 [1]");
                System.out.println("R$6.000,00 - R$6.400,00 [2]");
                System.out.println("R$6.500,00 - R$6.700,00 [3]");
                System.out.println("Versão Premium (+ R$10.000,00) [4]");

                int valor = myObj.nextInt();

                System.out.println("");
                System.out.println("Disponibilizamos duas marcas!");
                System.out.println("Intel [1]");
                System.out.println("Ryzen [2]");
                System.out.println("");
                System.out.println("Qual sua preferência?");
                System.out.println("");

                int marca = myObj.nextInt();

                if (valor == 1 && marca == 1){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel i5-10400F ");
                    System.out.println("Placa de Vídeo: Radeon RX 6600 XT 8GB ");
                    System.out.println("RAM: 16GB DDR4  ");
                    System.out.println("Armazenamento: SSD M.2 240GB   ");
                    System.out.println("");
                    System.out.println("Total = R$5.900,00");
                }

                if (valor == 2 && marca == 1){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel i5 11600K  ");
                    System.out.println("Placa de Vídeo: NVIDIA GeForce GTX 1660 Super  ");
                    System.out.println("RAM: 16GB DDR4  ");
                    System.out.println("Armazenamento: SSD M.2 NVMe 500GB    ");
                    System.out.println("");
                    System.out.println("Total = R$6.100,00");
                }

                if (valor == 3 && marca == 1){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel i7 10700F   ");
                    System.out.println("Placa de Vídeo: NVIDIA GeForce GTX 1660   ");
                    System.out.println("RAM: 16GB DDR4  ");
                    System.out.println("Armazenamento: SSD 240GB     ");
                    System.out.println("");
                    System.out.println("Total = R$6.500,00");
                }

                if (valor == 1 && marca == 2){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD Ryzen 7 5800X  ");
                    System.out.println("Placa de Vídeo: GeForce GTX 1660 6GB   ");
                    System.out.println("RAM: 16GB DDR4  ");
                    System.out.println("Armazenamento: SSD 240GB     ");
                    System.out.println("");
                    System.out.println("Total = R$6.200,00");
                }

                if (valor == 2 && marca == 2){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD Ryzen 5 5600X ");
                    System.out.println("Placa de Vídeo: GeForce RTX 2060 6GB   ");
                    System.out.println("RAM: 16GB DDR4  ");
                    System.out.println("Armazenamento: SSD 120GB     ");
                    System.out.println("");
                    System.out.println("Total = R$6.400,00");
                }

                if (valor == 3 && marca == 2){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD Ryzen 5 5600G ");
                    System.out.println("Placa de Vídeo: Radeon RX 6600 XT 8GB  ");
                    System.out.println("RAM: 16GB DDR4  ");
                    System.out.println("Armazenamento: SSD 240GB     ");
                    System.out.println("");
                    System.out.println("Total = R$6.400,00");
                } 

                if (valor == 4 && marca == 1){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: Intel i7-10700KF ");
                    System.out.println("Placa de Vídeo: GeForce RTX 3080 10GB  ");
                    System.out.println("RAM: 16GB DDR4  ");
                    System.out.println("Armazenamento: SSD 480GB     ");
                    System.out.println("");
                    System.out.println("Total = R$13.000,00");
                }

                if (valor == 4 && marca == 2){
                    System.out.println("");
                    System.out.println("Seu PC ideal é: ");
                    System.out.println("");
                    System.out.println("Processador: AMD Ryzen 9 5900X ");
                    System.out.println("Placa de Vídeo: GeForce RTX 3080 10GB  ");
                    System.out.println("RAM: 16GB DDR4  ");
                    System.out.println("Armazenamento: SSD M.2 240GB      ");
                    System.out.println("");
                    System.out.println("Total = R$13.000,00");
                }
            }
            

        }  
        
        System.out.println("");
        System.out.println("E aí, vai comprar seu novo computador? ");
        System.out.println("Sim [1] ");
        System.out.println("Não [2] ");

        int compra = myObj.nextInt(); 

        Scanner ler = new Scanner(System.in);

        if (compra == 1){
            System.out.println("");
            System.out.println("Qual será a forma de pagamento? ");
            System.out.println("");
            System.out.println("Cartão Débito/Crédito [1]");
            System.out.println("Boleto [2]");

            int pagamento = myObj.nextInt();

            if (pagamento == 1){

                String texto;
                
                
                System.out.println("");
                System.out.println("Nome do titular: ");
                texto = ler.nextLine();
                System.out.println("");
                System.out.println("Número do cartão: ");
                int numeroCartao = myObj.nextInt();
                System.out.println("");
                System.out.println("CVV: ");
                int cvv = myObj.nextInt();
                System.out.println("");
                System.out.println("Ano de Vencimento: ");
                int data = myObj.nextInt();
                System.out.println("");
                System.out.println("Estado: ");
                texto = ler.nextLine();
                System.out.println("");
                System.out.println("Cidade: ");
                texto = ler.nextLine();
                System.out.println("");
                System.out.println("CEP: ");
                int cep = myObj.nextInt();
                System.out.println("");

                System.out.println("Pagamento Confirmado! ");

                System.out.println("");

                System.out.println("Obrigado pela compra! ");


            }

            if (pagamento == 2){

                String texto;

                System.out.println("");
                System.out.println("Nome Completo: ");
                texto = ler.nextLine(); 
                System.out.println("");  
                System.out.println("CPF: ");
                int cpf = myObj.nextInt();
                System.out.println("");
                System.out.println("E-mail para envio: ");
                texto = ler.nextLine();
                System.out.println("");
                System.out.println("Estado: ");
                texto = ler.nextLine();
                System.out.println("");
                System.out.println("Cidade: ");
                texto = ler.nextLine();
                System.out.println("");
                System.out.println("CEP: ");
                int cep = myObj.nextInt();
                System.out.println("");

                System.out.println("Pagamento Confirmado! ");

                System.out.println("");

                System.out.println("Obrigado pela compra! ");

               

            }

            
            

        } myObj.close();
          ler.close();

    }
}
