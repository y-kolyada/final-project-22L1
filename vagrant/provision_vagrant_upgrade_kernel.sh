#!/bin/bash

vagrant up $1  --no-provision
vagrant provision $1 --provision-with=update_kernel
vagrant halt $1
vagrant up $1 --no-provision
vagrant provision $1 --provision-with=remove_old_kernels
vagrant provision $1
