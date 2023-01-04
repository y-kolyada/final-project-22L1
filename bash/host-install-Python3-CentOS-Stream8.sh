#!/bin/bash

dnf install -y epel-release
dnf install -y python39
# alternatives --remove-all python3
# alternatives --install /usr/bin/python3 python3 $(which python3.9) 111
# alternatives --set python3 $(which python3.9)
alternatives --set python $(which python3.9)
