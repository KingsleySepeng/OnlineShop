#!/bin/bash

# Script to rebuild Docker image, recreate Docker container, and start the container

# Define variables
IMAGE_NAME="spring-user-service"
CONTAINER_NAME="spring-user-container"

# Print header
echo "******************************************"
echo "*        Spring-User-Service             *"
echo "******************************************"

# Stop and remove existing container if it exists
echo "Stopping and removing existing container..."
docker stop $CONTAINER_NAME
docker rm $CONTAINER_NAME

# Remove existing image if it exists
echo "Removing existing image..."
docker rmi $IMAGE_NAME

# Build Docker image
echo "Building Docker image..."
docker build -t $IMAGE_NAME .

# Recreate and start Docker container
echo "Recreating and starting Docker container..."
docker run --name $CONTAINER_NAME -p 8080:8080 $IMAGE_NAME
