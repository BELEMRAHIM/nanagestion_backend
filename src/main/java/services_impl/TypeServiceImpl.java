package services_impl;

import models.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.TypeRepository;
import services.TypeService;

import java.util.List;


@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }

    @Override
    public Type getTypeById(long typeId) {
        return typeRepository.findById(typeId)
                .orElse(null); // Handle if the type is not found
    }

    @Override
    public Type createType(Type type) {
        return typeRepository.save(type);
    }

    @Override
    public Type updateType(long typeId, Type updatedType) {
        Type existingType = typeRepository.findById(typeId)
                .orElse(null);

        if (existingType != null) {
            existingType.setTypeName(updatedType.getTypeName());
            return typeRepository.save(existingType);
        } else {
            return null; // Handle if the type is not found
        }
    }

    @Override
    public void deleteType(long typeId) {
        typeRepository.deleteById(typeId);
    }
}
