echo "Building the containers"
docker build -t assignment7ubuntu:latest -f ./Dockerfile.ubuntu .
docker build -t assignment7alpine:latest -f ./Dockerfile.alpine .
docker build -t assignment7smaller:latest -f ./Dockerfile.smaller .

echo "Running the containers"
docker run -it --rm assignment7ubuntu:latest
docker run -it --rm assignment7alpine:latest
docker run -it --rm assignment7smaller:latest