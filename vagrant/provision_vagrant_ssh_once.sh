#!/bin/bash

vagrant up $1 --no-provision
# vagrant provision $1 --provision-with=add_ssh_public_key_for_ansible

# change:
# - variable [vars_files] in below .yml file
# - and variable [host_or_group] in corresponding inventory/group_vars/ file
ansible-playbook ansible/create_devops_user.yml
