
import os


def file_info(file_path):
    path, filename = os.path.split(file_path)
    name, extension = os.path.splitext(filename)
    return path, name, extension


print(file_info('C:\All Files\Repositories\python_2_0\w_5.py'))