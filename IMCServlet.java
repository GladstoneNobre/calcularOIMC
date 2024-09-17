
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


            out.println("<html>");
            out.println("<head><title>Resultado do IMC</title></head>");
            out.println("<body>");
            out.println("<h1>Resultado do IMC</h1>");
            out.println("<ul>");
            out.println("<li>Altura: " + altura + " m</li>");
            out.println("<li>Peso: " + peso + " kg</li>");
            out.println("<li>IMC: " + String.format("%.2f", imc.getValor()) + "</li>");
            out.println("<li>Resultado: " + imc.getResultado() + "</li>");
            out.println("</ul>");
            out.println("<a href='index.html'>Voltar para a página inicial</a>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
            out.println("<html><body><h1>Erro ao processar o IMC</h1>");
            out.println("<p>Certifique-se de que os valores inseridos são números válidos.</p>");
            out.println("<a href='imc.html'>Voltar</a></body></html>");
        } finally {
            out.close(); 
        }
    }

    public static class IMC {
        private double altura;
        private double peso;
        private double valor;

  
        public IMC(double altura, double peso) {
            this.altura = altura;
            this.peso = peso;
        }

        public void calcularIMC() {
            if (altura > 0) {
                valor = peso / (altura * altura);
            } else {
                valor = 0;
            }
        }

        public double getValor() {
            return valor;
        }

        public String getResultado() {
            if (valor < 18.5) {
                return "Abaixo do peso";
            } else if (valor >= 18.5 && valor < 24.9) {
                return "Peso normal";
            } else if (valor >= 25 && valor < 29.9) {
                return "Sobrepeso";
            } else {
                return "Obesidade";
            }
        }
    }
}