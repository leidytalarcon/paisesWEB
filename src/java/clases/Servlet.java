package clases;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {   
            
    
    ArrayList <Herencia> lista = new ArrayList<Herencia>();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
            
          
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<html>");
            out.println("<body bgcolor=green>");
            Herencia  p1 = new Herencia("sudafrica", "sudafricano", "rand",5,"frances","ciudad del cabo");
            Herencia  p2 = new Herencia("egipto", "egipcio", "libra",5,"arabe","cairo");
            Herencia  p3 = new Herencia("angola", "angoleño", "kwanza",5,"portugues","cairo");
            Herencia  p4 = new Herencia("libia", "libio", "dinar",5,"arabe","cairo");
            Herencia  p5 = new Herencia("niger", "nigerio", "franco cfa",5,"frances","cairo");
            lista.add(p1);
            lista.add(p2);
            lista.add(p3);
            lista.add(p4);
            lista.add(p5);
            
            String nom;
            nom = request.getParameter("dato");
            
            boolean x = false;
            int cont = 0;
            do{
                if(lista.get(cont).getNombre().equals(nom)){
                    out.println("La busqueda es : ");
                    out.println("<h3>Nombre: </h3>"+lista.get(cont).getNombre()+"<h3> Gentilicio: </h3>"+lista.get(cont).getGentilicio()+"<h3> Moneda: </h3>"+lista.get(cont).getMoneda()+"<h3> Cantidad: </h3>"+lista.get(cont).getCant()+"<h3> Idioma: </h3>"+lista.get(cont).getIdioma()+"<h3> Capital: </h3>"+lista.get(cont).getCapital());
                    x=true;
                }else{
                    cont++; 
                }
            }while(x!=true);
            out.println("<br><h2>coversion: </h2><br>");
            Iconversion g = new conversion();
            switch(nom){
                case "sudafrica":
                out.println(p1.getCant()+" rand equivale a "+g.operacion(p1.getCant(), 225.57)+" pesos colombianos");
                out.println("<h2>traduccion de español a frances</h2><br>");
                out.println("hola : Salut<br>"+'\n'+"adios : adieu<br>"+'\n'+"casa : maison<br>"+'\n'+"carro : chariot<br>"+'\n'+"universidad : l'universitè");
                break;
                case "egipto":
                out.println(p2.getCant()+" libras equivale a "+g.operacion(p2.getCant(), 207.85)+" pesos colombianos");    
                out.println("<h2>traduccion de español a arabe</h2><br>");
                out.println("hola : مرحبا<br>"+'\n'+"adios : وداعا<br>"+'\n'+"casa : منزل<br>"+'\n'+"carro : نقل<br>"+'\n'+"universidad : جامعة");
                break;
                case "angola":
                out.println(p3.getCant()+" kwanza equivale a "+g.operacion(p3.getCant(), 6.78)+" pesos colombianos");
                out.println("<h2>traduccion de español a portugues</h2><br>");
                out.println("hola : ola<br>"+'\n'+"adios : adeus<br>"+'\n'+"casa : casa<br>"+'\n'+"carro : carro<br>"+'\n'+"universidad : universidade");
                break;
                case "libia":
                out.println(p4.getCant()+" dinar equivale a "+g.operacion(p4.getCant(), 2.383)+" pesos colombianos");
                out.println("<h2>traduccion de español a arabe</h2><br>");
                out.println("hola : مرحبا<br>"+'\n'+"adios : وداعا<br>"+'\n'+"casa : منزل<br>"+'\n'+"carro : نقل<br>"+'\n'+"universidad : جامعة");    
                break;
                case "niger":
                out.println(p5.getCant()+" franco cfa equivale a "+g.operacion(p5.getCant(), 5.6534)+" pesos colombianos<br>");
                out.println("<h2>traduccion de español a frances</h2><br>");
                out.println("hola : Salut<br>"+'\n'+"adios : adieu<br>"+'\n'+"casa : maison<br>"+'\n'+"carro : chariot<br>"+'\n'+"universidad : l'universitè");      
                break;
            } 
            
            out.println("</body>");
            out.println("</html>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
