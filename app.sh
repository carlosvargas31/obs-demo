echo "Starting jar application..."

./gradlew clean bootjar

echo "Starting docker-compose for application..."

docker compose -f docker-compose.yml up -d --build