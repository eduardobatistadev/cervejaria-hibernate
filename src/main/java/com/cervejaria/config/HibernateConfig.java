package com.cervejaria.config;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.cervejaria.model.Cerveja;
import com.cervejaria.model.Cidade;
import com.cervejaria.model.Cliente;
import com.cervejaria.model.Estado;
import com.cervejaria.model.Estilo;
import com.cervejaria.model.Grupo;
import com.cervejaria.model.GrupoPermissao;
import com.cervejaria.model.ItemDaVenda;
import com.cervejaria.model.Permissao;
import com.cervejaria.model.Usuario;
import com.cervejaria.model.UsuarioGrupo;
import com.cervejaria.model.Venda;

public class HibernateConfig {
	
private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties prop = new Properties();
				
				// Banco de Dados
				prop.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				prop.put(Environment.URL, "jdbc:mysql://localhost:3306/cervejaria?useSSL=false");
				prop.put(Environment.USER, "root");
				prop.put(Environment.PASS, "123456");
				prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
				
				prop.put(Environment.SHOW_SQL, "true"); // em ambiente produtivo é false
				prop.put(Environment.HBM2DDL_AUTO, "update"); // em ambiente produtivo nunca utilizar create ou create-drop
				
				configuration.setProperties(prop);
				
				configuration.addAnnotatedClass(Cerveja.class);
				configuration.addAnnotatedClass(Cidade.class);
				configuration.addAnnotatedClass(Cliente.class);
				configuration.addAnnotatedClass(Estado.class);
				configuration.addAnnotatedClass(Estilo.class);
				configuration.addAnnotatedClass(Grupo.class);
				configuration.addAnnotatedClass(GrupoPermissao.class);
				configuration.addAnnotatedClass(ItemDaVenda.class);
				configuration.addAnnotatedClass(Permissao.class);
				configuration.addAnnotatedClass(Usuario.class);
				configuration.addAnnotatedClass(UsuarioGrupo.class);
				configuration.addAnnotatedClass(Venda.class);
		
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties())
						.build();
				
					sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

	// retorna a chave primaria
		public static Object getPrimaryKey(Object entidade) {
			return sessionFactory.getPersistenceUnitUtil().getIdentifier(entidade);
		}
}
