#!/bin/bash

# Get IMAGE IDs of images with <none> tag
none_images=$(docker images -q -f "dangling=true")

# Check if there are any <none> tagged images
if [ -n "$none_images" ]; then
    echo "Deleting images with <none> tag..."
    # Loop through each image and delete it
    for image_id in $none_images; do
        docker rmi $image_id
    done
    echo "Deleted all images with <none> tag."
else
    echo "No images with <none> tag found."
fi
