# spring-microservice

# Endpoints

http://localhost:8761/ - eureka server

http://localhost:8000/currency-exchange/from/USD/to/INR
http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10

http://localhost:8765/CURRENCY-EXCHANGE-SERVICE/currency-exchange/from/USD/to/INR
http://localhost:8765/CURRENCY-CONVERSION-SERVICE/currency-conversion/from/USD/to/INR/quantity/10
http://localhost:8765/CURRENCY-CONVERSION-SERVICE/currency-conversion-feign/from/USD/to/INR/quantity/10

http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR
http://localhost:8765/currency-conversion-service/currency-conversion/from/USD/to/INR/quantity/10
http://localhost:8765/currency-conversion-service/currency-conversion-feign/from/USD/to/INR/quantity/10

http://localhost:8765/currency-exchange/from/USD/to/INR
http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10

docker run -p 9411:9411 68573832bf4cfc051da0d4094a7c8ded43375569fbaf46fbebdf8f7e5f37099c - run zipkin container
