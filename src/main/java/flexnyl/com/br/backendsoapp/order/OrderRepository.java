package flexnyl.com.br.backendsoapp.order;


import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order,Long>{
    
}
