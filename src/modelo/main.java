package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.SessionFactoryUtil;
import modelo.Empleados;
import modelo.Empresas;
import modelo.Fijos;
import modelo.Temporales;

public class main {
	
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		

	/*	try {
		session.beginTransaction();
			
			Empresas empresa = new Empresas();
			empresa.setCif("B12345678");
			empresa.setDirección("Pasaje Cadiz");
			empresa.setNombre("Casa Matias");
			empresa.setTeléfono("652652652");
			

			session.save(empresa);
			session.getTransaction().commit();;
			
			
			
			
		} catch (Exception ex) {
			System.out.println("Ha ocurrido una excepción para crear la empresa " + ex.getMessage());
			
			
			
		} finally {
			session.close();
		}
		*/
		
		try {
			session.beginTransaction();
			
			Empresas empresa1 = session.get(Empresas.class, "B12345678");
				
				Fijos empleadofijo = new Fijos();
				empleadofijo.setDni("531947163B");
				empleadofijo.setNombre("Antonio");
				empleadofijo.setPorcentaRetención(5.55f);
				empleadofijo.setTeléfono("653426562");
				empleadofijo.setEmpresa(empresa1);
					
				
					

					session.save(empleadofijo);
					session.getTransaction().commit();;
				 
				
				
			} catch (Exception ex) {
				System.out.println("Ha ocurrido una excepción para crear el empleado" + ex.getMessage());
				
				
				
			} finally {
				session.close();
			}
		
	}
	}
	
	



